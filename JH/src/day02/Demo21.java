package day02;
/**
 * �̳е�ʱ�����Ĵ�������
 * 1.JAVA���ȵݹ������������䷽����
 * 2.���丸�����͵��ڴ�
 * 3.�ݹ���ù�����
 * 
 *
 */
public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Doo n=new Doo();
        System.out.println(n.a+" "+n.b+" "+n.c);
	}

}
class Woo{
	int a=2;
	public Woo(){
		System.out.println(a);//������䣬�˴�a=2
		}
}
class Qoo extends Woo{
	int b=3;
	public Qoo(){
		super();//���������дҲ��Ĭ����ӵ�
		a=4;
		b=6;
		System.out.println(a+" "+b);//������䣬�˴�a=4,b=6;
	}
}
class Doo extends Qoo{
	int c=8;
	 public Doo(){
		 super();
		 a=1;b=9;c=10;
	 }
}