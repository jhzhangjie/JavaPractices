package day02;
/**
 * �����ڲ���==�ڲ���
 * new Uoo(){}�ͽ������ڲ��࣬���Ǽ̳�Uoo������࣬����ͬʱ���������͵�ʵ��������{}�������͵����壻
 * 
 *
 */
public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Uoo u=new Uoo();//����Uooʵ��
        Uoo u1=new Uoo(){};//���������ڲ���ʵ��
        Uoo u2=new Uoo(){
        	public void test(){//��������д
        		System.out.println("U2.test����");
        	}
        };
        u2.test();//�����������ڲ�������д�ķ���
        Doo7 d=new Doo7(){
        	public void test(){
        		System.out.println("���test");
        	}
        };
        d.test();
	}

}
interface Doo7{
	void test();
}
class Uoo{
	void test(){}
}