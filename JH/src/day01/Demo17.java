package day01;

import java.util.Scanner;

/**
 * 计算y=  9+  99+    999+     9999+.....
 *    i=  1   2      3         4
 *    num=9   9*10+9 99*10+9  999*10+9......
 *    那么当i=n时，第n项的公式：num=num*10+9(其中num是(n-1项的值))
 * @author JH
 *
 */

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("请输入次数：");
		int n=console.nextInt();
	    int num=0;
        int sum=0;
        for(int i=1;i<=n;i++){//n次循环
        	num=num*10+9;
        	sum+=num;
        	//跟踪语句，用于跟踪运行期间变量的值！
        	System.out.println(i+","+num+","+sum);
        }
        System.out.println(sum);
	}

}
