package day01;
/**
 * �ݹ���ã�һ��������ֱ�ӻ��ӵ��÷�������
 * ҵ����
 * �Ȳ����еĵݹ鹫ʽ��y=f(n)=1+2+3+4+...+n=n+f(n+1)����f(1)=1
 * 
 *�ݹ�ʹ��ע�⣺һ���еݹ��������
 *ȱ�㣺����ռ�á�ջ�ڴ桱�����ܲ���
 *�ŵ㣺����������ż�ֻ࣬��Ҫ�����һ��
 */
public class Demo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int y=f(6);
        System.out.println(y);
	}
    public static int f(int n){
    	if(n==1){
    		return 1;//�ݹ������������ִ�д����ʱ�������return��ִ�С�
    	}
    	return n+f(n-1);
    }
}
