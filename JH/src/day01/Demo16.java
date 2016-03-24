package day01;
/**
 * º∆À„PI
 * PI=4*£®1/1-1/3+1/5-1/7.°£°£°£°£
 * sum=£®1/1-1/3)+(1/5-1/7)+(1/9-1/11)+°£°£°£°£
 * i=    1          5         9
 * @author JH
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=100000;
        int sum=0;
        for(int i=1;i<=n;i+=4){
        	//1=1'5'9....
            sum+=(1.0/i)-(1.0/(i+2));
        }
        double pi=sum*4;
        System.out.println(pi);
	}

}
