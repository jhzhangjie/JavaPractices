package day01;
/**
 * 
 *����Fibonacci���еĵ�n���f1=f2=1,�ӵ�3�ʼ����һ�����ǰ����֮��
 *
 */
public class Demo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(f(9));//��������
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
