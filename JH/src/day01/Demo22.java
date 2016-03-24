package day01;
/**
 * 
 * 输出100~999之间所有的水仙花树
 *
 */
public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=100;n<1000;n++){
		int num=n;
	    int sum=0;
	    while(num!=0){
	    	int last=num%10;
	        num/=10;
	    	sum+=last*last*last;
	     }
	     if(sum==n){
	    	System.out.println(n+"是水仙花数");
	     }
		}
	}

}
