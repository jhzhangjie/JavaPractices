package day02;
/**
 * 1.��̬�಻�ܱ��̳С�
 * 2.һ����ľ�̬�����������в��ܱ���д��
 * 3.final���εı���ֻ�ܳ�ʼ��������ֵһ�Σ����������޸�
 * static final��ͬ���εĽг�������Ϊֻ��һ�ݲ��Ҳ����޸�
 *
 */
public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        final int a=5;//final����ľֲ�������
        //a=8;���������Ϊfinal����ı������ܱ��޸�
        int b=5;
        b=12;
        b++;
        test(a,b);//��̬������Ҫ����������,������������ʡ��
        Dog g=new Dog();
        Dog g1=new Dog();
        System.out.println(g.id + " " + g1.id + "" + Dog.numberOfdog);
	}
   public static void test(final int a,int b){//�������һ����̬����
	   //a++;�������final����ı��������޸�
	   System.out.println(a);
	   b++;
	   System.out.println(b);
   }
}
class Dog{
	final int id;//ʵ��������ÿ��������һ�ݣ������ٴ��޸�
	static int numberOfdog=0;//��̬����������һ��
	public Dog(){
		id=numberOfdog++;
	}
}
