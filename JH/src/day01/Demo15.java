package day01;
import java.math.BigInteger;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=76;
        BigInteger y=new BigInteger("1");
        for(int i=1;i<=n;i++){
        	//int���͵�iת��ΪBigInteger���͵���num
        	BigInteger num=BigInteger.valueOf(i);
        	//y=y.multiply(num);������󣬲������ͱ�����BigInteger
        	y=y.multiply(num);
        }
        System.out.println(y);
	}

}
