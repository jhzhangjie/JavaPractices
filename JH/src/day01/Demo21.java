package day01;
/**
 * ˮ�ɻ�����Ҳ��Ϊ3λ����������һ��3λ�������������ÿ�����ֵ�3���ݵĺ�
 * �磺153=1*1*1+5*5*5+3*3*3
 * ����ж�һ�����Ƿ�Ϊˮ�ɻ���
 * ���һ�������ۼ�ÿ������3���ݵĺ���ԭ���ֱȽ�
 * 
 *
 */

public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=153;
       int num=n;
       int sum=0;
       while(num!=0){
    	   int last=num%10;
    	   num/=10;
    	   sum+=last*last*last;
    	   System.out.println(last+","+num+","+sum);
      }
       if(sum==n){
    	   System.out.println(n+"��ˮ�ɻ���");
       }
       
	}

}
