package day01;
import java.util.Scanner;
/**
 * 
 *����Fibonacci���еĵ�n���f1=f2=1,�ӵ�3�ʼ����һ�����ǰ����֮��
 *
 */
public class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int f1=1;
       int f2=1;
       int fn=2;
       
       Scanner in=new Scanner(System.in);//�������һ����
       System.out.print("������n:");
       String s=in.nextLine();//���ַ�����ȡ
       int n=Integer.parseInt(s);//����ȡ��10���������ַ���ת��Ϊ��������
       for(int i=3;i<=n;i++){
    	   
    	   fn=f1+f2;
    	   f1=f2;
    	   f2=fn;
    	   
       }
       System.out.println(fn);
	}

}
