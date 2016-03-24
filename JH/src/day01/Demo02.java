package day01;
/**
 * ��������Ϸ
 * ���磺ABEGC
 * �û����룺ABHMN
 * ����1�Σ��¶�2���ַ���2��λ��ƥ��
 * �û����룺ABHCM
 * ����2�Σ��¶�3���ַ���2��λ��ƥ��
 * �û����룺ABEGC
 * ����3�Σ��¶�5���ַ���5��λ��ƥ��
 *
 *
 *
 * main()��ɲ²����̿���
 * 1�������ɴ𰸡��ַ����У�5���ַ�
 * 2���ȴ��û��Ĵ�����
 * 3��������û�����Ĵ𰸡������������ƥ��������ƥ��λ��
 * 4����ʾ�����������2��
 *
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char[] answer;
    char[] input;
    int count=0;
    int[] result;
    answer=generate(5);
    for(;;){
    	input=userInput();
    	count++;
    	result=check(answer,input);
    	show(count,result);
    	if(result[0]==5&&result[1]==5){
    		break;
    	}
    }
   
    }
	public static char[] generate(int n){
		//���ݣ�ȫ���Ĵ�д��ĸ������n�����ظ����ַ�
		char[] chs={'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		boolean[] used=new boolean[chs.length];
		int i;
		char[] answer=new char[n];
		int index=0;
		Random r=new Random();
		do{
			i=r.nextInt(chs.length);//i�ķ�Χ[0.chs.length)
			if(used[i]){
				continue;
			}
			answer[index++]=chs[i];
			used[i]=true;
			
		}while(index!=n);
		System.out.println(answer);
		return answer;
		
	}
	public static char[] userInput(){
		Scanner in=new Scanner(System.in);
		char[] input;
		do{
			System.out.println("����²⣺");
			String s=in.nextLine();//�ӿ���̨��ȡһ���ַ���
			input=s.toCharArray();//���ַ���ת��Ϊ�ַ�����
			
			
			}while(input.length!=5);
		return input;
	}
	public static int[] check(char[] answer,char[]input){
		int[] result={0,0};
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<input.length;j++){
				if(answer[i]==input[j]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}
	public static void show(int count,int[] result){
		if(result[0]==5&&result[1]==5){
			System.out.println("������"+count+"�ξͲ�����");
			return;//return���ĺ��壺�������if����ʱ�򣬾Ͳ���ִ�������������
		}
		System.out.println("����"+count+"��!"+"���в¶���"+result[0]
				+"���ַ�"+","+"�¶���"+result[1]+"���ַ���λ��");
	}
}
