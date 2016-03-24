package day01;
import java.util.Scanner;
/**
 * switch case
 * @author JH
 *演示案例：根据分数计算
 *评定级别：优秀  良好  中等 及格  不及格
 */

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("输入成绩：");
		int score=console.nextInt();
        String level;
        switch(score/10){
        case 10:
        case 9:
        	level ="优秀";break;
        case 8:
        	level="良好";break;
        case 7:
        	level="中等";break;
        case 6:
        	level="及格";break;
        default:
        	level="不及格";
        }
        System.out.println(level);
	}

}
