package day01;

import java.util.Scanner;

/**
 * ����̨����
 * ��ѭ���汾
 */
public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner console=new Scanner(System.in);
        int score;
        while(true){
        	System.out.println("���������");
            score=console.nextInt();
            if(score>=0||score<=100){
        	break;
            }
        System.out.println("Orz������");
	   }
    System.out.println("������"+score);
}
}
