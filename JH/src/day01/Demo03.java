package day01;
import java.util.Random;
import java.util.Arrays;
/**
 * 
 * Arrays API
 * toString()��������������Ϊ�ַ���
 *����������Ա�ݵ�������������
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ary={1,2,3,4,5,6,7,8};
        Random r=new Random();
        for(int i=ary.length-1;i>=1;i--){
        	int j=r.nextInt(i);//j=[0,i)
        	int t=ary[i];
        	ary[i]=ary[j];
        	ary[j]=t;
        	
        }
        String str=Arrays.toString(ary);
        System.out.println(str);//System.out.println(Arrays.toString(ary));
	}

}
