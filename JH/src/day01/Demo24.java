package day01;

import java.util.Scanner;
import java.util.Random;
/**
 * 猜数字游戏
 * 1）数据：被猜测数据num
 *        用户输入数据：guess
 *        猜测次数（分数）：score
 * 2）过程
 *  1.生成随机被猜测数据1~100
 *  2.获得用户输入的数据
 *  3.score++
 *  4.比较用户输入与被猜测数据
 *    4.1一样就结束游戏
 *    4.2大了就提示猜大了
 *    4.3小了就提示猜小了
 *  5.返回2
 * 3）实现
 * 
 *
 */

public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,guess;
        int score=0;
        Random random=new Random();
        //random.nextInt(100)此句获取的数范围是[0,99].
        // 那么random.nextInt(100)+1的范围是[1,100]
        num=random.nextInt(100)+1;
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.print("输入猜测的数：");
        guess=in.nextInt();
        score++;
        if(guess==num){
        	System.out.println(score+"天才啊");
        	break;
        }else if(guess>num){
        	System.out.println(score+"猜大了");
        }else{
        	System.out.println(score+"猜小了");
        }
        //跟踪语句
        System.out.println(num+","+guess+","+score);
        }
	}

}
