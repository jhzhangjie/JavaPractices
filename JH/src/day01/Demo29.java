package day01;

import java.util.Arrays;
import java.util.Random;


public class Demo29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ary1=new int[10000];
		Random console=new Random();
		for(int i=0;i<ary1.length;i++){
			ary1[i]=console.nextInt();//�˴λ������һ�������
			
		}
		int ary2[]=Arrays.copyOf(ary1, ary1.length);
		System.out.println(Arrays.equals(ary1,ary2));
		long t1=System.currentTimeMillis();//����ʼִ�е���������ʱ��
		Arrays.sort(ary1);
		long t2=System.currentTimeMillis();//����ʼִ�е���������ʱ��
		System.out.println(t2-t1);
	}
}
