package day01;

import java.util.Arrays;

/**
 * ���������
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] hotel={"Tom","Andy","Jerry"};
        System.out.println(Arrays.toString(hotel));
        //����
        hotel=Arrays.copyOf(hotel, hotel.length+1);
        System.out.println(Arrays.toString( hotel));
        //׷��
        hotel[3]="JHUAN";//hotel[hotel.length-1]="JHUAN";
        System.out.println(Arrays.toString( hotel));
	}

}
