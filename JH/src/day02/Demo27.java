package day02;
/**
 * final ����ֻ�ܳ�ʼ��һ�Σ��������޸ġ�
 */
import java.util.Arrays;

public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String s="ABC";
        //s="A";final ����ı���ֻ�ܳ�ʼ��һ�Σ��������޸�
        final String[] ary={"A","B"};
        ary[0]="AS";//����Ԫ�ؿ����޸ģ�
        //ary=null;��������������޸�
        System.out.println(Arrays.toString(ary));
        System.out.println(s);
        final Hooo h=new Hooo();//�˴�final�����h�����޸ġ�
        
        h.s=7;//h���涨������Կ����޸�
        System.out.println(h.s);
	}

}
class Hooo{
	int s=4;
}