package day01;
import java.util.Scanner;
/**
 * ����a,b
 * @author JH
 *
 */

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner console=new Scanner(System.in);
        System.out.println("������������a,b:");
        int a=console.nextInt();
        int b=console.nextInt();
        if(a>b){
        	int t=a;
        	a=b;
        	b=t;
        }
        System.out.println(a+""+b);
	}

}
