package day01;
/**
 * 水仙花数：也成为3位自幂数，是一个3位数，这个数等于每个数字的3次幂的和
 * 如：153=1*1*1+5*5*5+3*3*3
 * 如何判断一个数是否为水仙花数
 * 拆分一个数，累加每个数字3次幂的和与原数字比较
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
    	   System.out.println(n+"是水仙花数");
       }
       
	}

}
