package day01;

import java.util.Scanner;
import java.util.Random;
/**
 * ��������Ϸ
 * 1�����ݣ����²�����num
 *        �û��������ݣ�guess
 *        �²��������������score
 * 2������
 *  1.����������²�����1~100
 *  2.����û����������
 *  3.score++
 *  4.�Ƚ��û������뱻�²�����
 *    4.1һ���ͽ�����Ϸ
 *    4.2���˾���ʾ�´���
 *    4.3С�˾���ʾ��С��
 *  5.����2
 * 3��ʵ��
 * 
 *
 */

public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,guess;
        int score=0;
        Random random=new Random();
        //random.nextInt(100)�˾��ȡ������Χ��[0,99].
        // ��ôrandom.nextInt(100)+1�ķ�Χ��[1,100]
        num=random.nextInt(100)+1;
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.print("����²������");
        guess=in.nextInt();
        score++;
        if(guess==num){
        	System.out.println(score+"��Ű�");
        	break;
        }else if(guess>num){
        	System.out.println(score+"�´���");
        }else{
        	System.out.println(score+"��С��");
        }
        //�������
        System.out.println(num+","+guess+","+score);
        }
	}

}
