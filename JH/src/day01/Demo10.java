package day01;
import java.util.Scanner;
/**
 * 
 * �ж�ĳ���Ƿ�Ϊ����
 *
 */

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner console=new Scanner(System.in);
       System.out.println("�������");
       int year=console.nextInt();
       boolean isLeaapYear;
       isLeaapYear= (year%4==0&&!(year%100==0))||(year%400==0);
       if(isLeaapYear){
    	   System.out.println(year+"������");
       }else{
    	   System.out.println(year+"��������");
       }
	}

}
