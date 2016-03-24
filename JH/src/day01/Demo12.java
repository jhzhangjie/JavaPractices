package day01;
import java.util.Scanner;
/**
 * 多路分支语句
 * @author JH
 *
 */

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score;
        Scanner console=new Scanner(System.in);
        System.out.print("输入分数：");
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
