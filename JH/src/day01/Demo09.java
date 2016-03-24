package day01;
import java.util.Scanner;
public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d,max;
        Scanner console=new Scanner(System.in);
        System.out.println("输入3个整数(a,b,c,):");
        a=console.nextInt();//连续输入3个整数
        b=console.nextInt();
        c=console.nextInt();
       
        max=a>b?a:b;
        max=max>c?max:c;
      
        System.out.println(max+"是最大的");
	}

}
