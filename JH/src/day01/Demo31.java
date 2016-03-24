package day01;
/**
 * 递归调用：一个方法中直接或间接调用方法本身
 * 业务案列
 * 等差数列的递归公式：y=f(n)=1+2+3+4+...+n=n+f(n+1)并且f(1)=1
 * 
 *递归使用注意：一定有递归结束条件
 *缺点：大量占用“栈内存”，性能不好
 *优点：解决问题优雅简洁，只需要处理第一层
 */
public class Demo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int y=f(6);
        System.out.println(y);
	}
    public static int f(int n){
    	if(n==1){
    		return 1;//递归结束条件，当执行此语句时，下面的return不执行。
    	}
    	return n+f(n-1);
    }
}
