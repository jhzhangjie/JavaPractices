package day01;
/**
 * 
 * ���100~999֮�����е�ˮ�ɻ���
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
	    	System.out.println(n+"��ˮ�ɻ���");
	     }
		}
	}

}
