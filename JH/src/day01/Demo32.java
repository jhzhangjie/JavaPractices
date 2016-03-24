package day01;
/**
 * ע�⣺1.��Ҫ���ַ�ɢ�͵ݹ飬��һ��2,2��4....n��2��3����
 * 2.�ݹ����Ȳ���̫�����ջ�����
 * Fibonacci���еݹ鶨��
 * f(n)=f(n-1)+f(n-2)����f(1)=f(2)=1
 *
 */
public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(f(6));
        System.out.println(f1(6));
        System.out.println(f(50));//�ݹ��ִ��ʱ���������Ϊ�д�������ļ���
        System.out.println(f1(50));//ѭ����ִ��Ч�ʱȽϸ�
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
