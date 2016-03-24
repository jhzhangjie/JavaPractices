package day01;
import java.util.Scanner;
/**
 * 
 * 判断某年是否为瑞年
 *
 */

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner console=new Scanner(System.in);
       System.out.println("输入年份");
       int year=console.nextInt();
       boolean isLeaapYear;
       isLeaapYear= (year%4==0&&!(year%100==0))||(year%400==0);
       if(isLeaapYear){
    	   System.out.println(year+"是瑞年");
       }else{
    	   System.out.println(year+"不是瑞年");
       }
	}

}
