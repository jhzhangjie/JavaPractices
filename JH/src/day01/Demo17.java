package day01;

import java.util.Scanner;

/**
 * ����y=  9+  99+    999+     9999+.....
 *    i=  1   2      3         4
 *    num=9   9*10+9 99*10+9  999*10+9......
 *    ��ô��i=nʱ����n��Ĺ�ʽ��num=num*10+9(����num��(n-1���ֵ))
 * @author JH
 *
 */

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("�����������");
		int n=console.nextInt();
	    int num=0;
        int sum=0;
        for(int i=1;i<=n;i++){//n��ѭ��
        	num=num*10+9;
        	sum+=num;
        	//������䣬���ڸ��������ڼ������ֵ��
        	System.out.println(i+","+num+","+sum);
        }
        System.out.println(sum);
	}

}
