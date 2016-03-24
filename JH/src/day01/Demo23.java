package day01;

import java.util.Scanner;

/**
 * 控制台输入
 * 死循环版本
 */
public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner console=new Scanner(System.in);
        int score;
        while(true){
        	System.out.println("输入分数：");
            score=console.nextInt();
            if(score>=0||score<=100){
        	break;
            }
        System.out.println("Orz错啦！");
	   }
    System.out.println("分数："+score);
}
}
