package day01;

import java.util.Arrays;

/**
 * 数组的扩容
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] hotel={"Tom","Andy","Jerry"};
        System.out.println(Arrays.toString(hotel));
        //扩容
        hotel=Arrays.copyOf(hotel, hotel.length+1);
        System.out.println(Arrays.toString( hotel));
        //追加
        hotel[3]="JHUAN";//hotel[hotel.length-1]="JHUAN";
        System.out.println(Arrays.toString( hotel));
	}

}
