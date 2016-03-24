package day01;

import java.util.Arrays;

/**
 * Arrays.fill()填充方法
 *
 *
 */

public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] person=new int[3];
    Arrays.fill(person,20);//fil是将person数组中每个元素都设置为20
    System.out.println(Arrays.toString(person));
	}

}
