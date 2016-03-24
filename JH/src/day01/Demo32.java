package day01;
/**
 * 注意：1.不要出现发散型递归，即一变2,2变4....n变2的3次幂
 * 2.递归的深度不能太深，否则栈会崩溃
 * Fibonacci数列递归定义
 * f(n)=f(n-1)+f(n-2)并且f(1)=f(2)=1
 *
 */
public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(f(6));
        System.out.println(f1(6));
        System.out.println(f(50));//递归的执行时间很慢，因为有大量冗余的计算
        System.out.println(f1(50));//循环的执行效率比较高
	}
    public static long f(int n){
    	if(n==1||n==2){
    		return 1;
    	}
    	
    	return f(n-1)+f(n-2);
    }
    public static long f1(int n){
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
