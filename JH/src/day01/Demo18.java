package day01;

import java.util.Scanner;

/**
 * ����Ŀ�ģ�����break
 * ���У�1.���һ�����Ƿ�Ϊ������������
 * ������һ�����������ܹ����������1���������ܱ�����������
 * ����ж�һ�����Ƿ�Ϊ�����������Լ����2~n/2���Ͳ�������
 * ���㷽����
 * ������num
 * ���num�Ƿ��ܱ�n(2~num/2)����������ܱ������Ͳ��ټ����һ��Լ���������жϲ�������
 * �磺num=36
 * n=2,3,4.....36/2
 * ����if(num%n==0)��������break;
 * 
 * 
 *
 */

public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consloe=new Scanner(System.in);
		System.out.print("����Ҫ�������֣�");
		int num=consloe.nextInt();
        boolean isPrime=true;//������
        for(int i=2;i<=num/2;i++){
        	if(num%i==0){
        		isPrime=false;
        		break;
        	}
          }
       if(isPrime){
        	System.out.println(num+"������");
        }else{
        	System.out.println(num+"��������");
        }
	}

}
