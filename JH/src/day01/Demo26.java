package day01;

import java.util.Arrays;
import java.util.Random;

/**
 * ϴ���㷨��Ҳ��Ϊ���ң�
 * 
 *
 */

public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] cards={"����A","÷��3","����6","����10","����9","����2"};
        Random console=new Random();
        for(int i=cards.length-1;i>=1;i--){
        	int j=console.nextInt(i);//��ʱj��ȡֵ��Χ��[0,i)
        	String t=cards[i];
        	cards[i]=cards[j];
        	cards[j]=t;
        }
        System.out.println(Arrays.toString(cards));
        //����for(int i=0;i<cards.length;i++){
         //    System.out.println(cards[i]);  
          // } 
	}

}
