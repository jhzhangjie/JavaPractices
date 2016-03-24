package day01;
/**
 * 输出1000以内所有质数
 * @author JH
 *
 */


public class Demo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=2;num<1000;num++){
		 boolean isPrime=true;//是质数
	        for(int i=2;i<=num/2;i++){
	        	if(num%i==0){
	        		isPrime=false;
	        		break;
	        	}
	          }
	       if(isPrime){
	        	System.out.println(num);
	        }
		}
	}

}
