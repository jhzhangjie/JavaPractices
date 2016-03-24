package day01;
/**
 * 猜数字游戏
 * 比如：ABEGC
 * 用户输入：ABHMN
 * 猜了1次，猜对2个字符，2个位置匹配
 * 用户输入：ABHCM
 * 猜了2次，猜对3个字符，2个位置匹配
 * 用户输入：ABEGC
 * 猜了3次，猜对5个字符，5个位置匹配
 *
 *
 *
 * main()完成猜测流程控制
 * 1）“生成答案”字符序列：5个字符
 * 2）等待用户的答案输入
 * 3）“检查用户输入的答案”，检查结果包括匹配数量和匹配位置
 * 4）提示检查结果，返回2）
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
		//数据：全部的大写字母，返回n个不重复的字符
		char[] chs={'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
		boolean[] used=new boolean[chs.length];
		int i;
		char[] answer=new char[n];
		int index=0;
		Random r=new Random();
		do{
			i=r.nextInt(chs.length);//i的范围[0.chs.length)
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
			System.out.println("输入猜测：");
			String s=in.nextLine();//从控制台读取一个字符串
			input=s.toCharArray();//将字符串转换为字符数组
			
			
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
			System.out.println("厉害！"+count+"次就猜中啦");
			return;//return语句的含义：当满足此if语句的时候，就不会执行下面的输出语句
		}
		System.out.println("猜了"+count+"次!"+"其中猜对了"+result[0]
				+"个字符"+","+"猜对了"+result[1]+"个字符的位置");
	}
}
