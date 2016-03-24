package day02;

import java.util.Arrays;

/**
 * java API中的重载方法
 * Arrays.toString()  Arrays.sort()   println()  Arrays.equals()
 * Math.max()
 * 
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Arrays.sort()是重载的方法
		int[] ary={3,6,4,8,1,9};
		Arrays.sort(ary);
		String[] names={"Jerrtt","Fhnj","Tom","Lin","Zhang"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(names));
		//println()是重载方法，其中一个重载是方法println(char[])
		int[] ary1={'A','B','C'};//此处调用的是println(object)
		char[] ary2={'A','B','C'};//此处调用的是println(char[])
		System.out.println(Arrays.toString(ary1));
		System.out.println(ary2);
	}

}
