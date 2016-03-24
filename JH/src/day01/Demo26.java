package day01;

import java.util.Arrays;
import java.util.Random;

/**
 * 洗牌算法（也称为打乱）
 * 
 *
 */

public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] cards={"黑桃A","梅花3","方块6","红桃10","方块9","黑桃2"};
        Random console=new Random();
        for(int i=cards.length-1;i>=1;i--){
        	int j=console.nextInt(i);//此时j的取值范围是[0,i)
        	String t=cards[i];
        	cards[i]=cards[j];
        	cards[j]=t;
        }
        System.out.println(Arrays.toString(cards));
        //或者for(int i=0;i<cards.length;i++){
         //    System.out.println(cards[i]);  
          // } 
	}

}
