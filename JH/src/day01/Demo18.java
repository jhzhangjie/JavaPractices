package day01;

import java.util.Scanner;

/**
 * 案列目的：测试break
 * 案列：1.检查一个数是否为质数（素数）
 * 质数：一个数，除了能够被被自身和1整除，不能被其他数整除
 * 如何判断一个数是否为质数，如果有约数（2~n/2）就不是质数
 * 计算方案：
 * 有数字num
 * 检查num是否能被n(2~num/2)整除，如果能被整除就不再检查下一个约数，并且判断不是质数
 * 如：num=36
 * n=2,3,4.....36/2
 * 规律if(num%n==0)不是质数break;
 * 
 * 
 *
 */

public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consloe=new Scanner(System.in);
		System.out.print("输入要检查的数字：");
		int num=consloe.nextInt();
        boolean isPrime=true;//是质数
        for(int i=2;i<=num/2;i++){
        	if(num%i==0){
        		isPrime=false;
        		break;
        	}
          }
       if(isPrime){
        	System.out.println(num+"是质数");
        }else{
        	System.out.println(num+"不是质数");
        }
	}

}
