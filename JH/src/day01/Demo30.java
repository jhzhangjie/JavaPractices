package day01;
/**
 * 
 *计算Fibonacci数列的第n项，即f1=f2=1,从第3项开始，后一项等于前两项之和
 *
 */
public class Demo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(f(9));//函数调用
	}
	public static long f(int n){
		long f1,f2,fn;
		f1=f2=fn=1;
		for(int i=3;i<=n;i++){
			fn=f1+f2;
			f1=f2;
			f2=fn;
		}
		return fn;
	}

}
