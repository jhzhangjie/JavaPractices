package day02;

import java.util.Arrays;

/**
 * java API�е����ط���
 * Arrays.toString()  Arrays.sort()   println()  Arrays.equals()
 * Math.max()
 * 
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Arrays.sort()�����صķ���
		int[] ary={3,6,4,8,1,9};
		Arrays.sort(ary);
		String[] names={"Jerrtt","Fhnj","Tom","Lin","Zhang"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(names));
		//println()�����ط���������һ�������Ƿ���println(char[])
		int[] ary1={'A','B','C'};//�˴����õ���println(object)
		char[] ary2={'A','B','C'};//�˴����õ���println(char[])
		System.out.println(Arrays.toString(ary1));
		System.out.println(ary2);
	}

}
