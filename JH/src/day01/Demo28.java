package day01;
import java.util.Scanner;
/**
 * 
 *计算Fibonacci数列的第n项，即f1=f2=1,从第3项开始，后一项等于前两项之和
 *
 */
public class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int f1=1;
       int f2=1;
       int fn=2;
       
       Scanner in=new Scanner(System.in);//随机输入一个数
       System.out.print("请输入n:");
       String s=in.nextLine();//按字符串读取
       int n=Integer.parseInt(s);//将读取的10进制数字字符串转换为整型数据
       for(int i=3;i<=n;i++){
    	   
    	   fn=f1+f2;
    	   f1=f2;
    	   f2=fn;
    	   
       }
       System.out.println(fn);
	}

}
