package day01;
import java.util.Scanner;
/**
 * ��·��֧���
 * @author JH
 *
 */

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score;
        Scanner console=new Scanner(System.in);
        System.out.print("���������");
        score=console.nextInt();
        if(score>=90){
        	System.out.println("A");
        }else if(score>=80){
        	System.out.println("B");
        }else if(score>=70){
        	System.out.println("C");
        }else{
        	System.out.println("D");
        }
	}

}
