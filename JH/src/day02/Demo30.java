package day02;
/**
 * �ӿ���ֻ�ܶ�����󷽷��ͳ�����
 * �ӿڿ��Զ�����������ӿڲ���ʵ��������ֻ���ܱ�ʵ�֣�
 * ����ʵ��һ���ӿڣ�����Ҫʵ��ȫ���ĳ��󷽷�
 * ���������ʵ�ֶ���ӿڣ����Ƕ�̳�����
 * imlemensʵ�֣�ʵ���Ǽ̳й�ϵ��
 * 
 *
 */

public class Demo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cat c=new Cat();
         Runner v=c;
         Hunter m=c;
         m.hunt();
         m.run();
         v.run();
       //new Runner();������󣬲��ܴ����ӿڵ�ʵ��
	}

}
class Cat implements Hunter{//һ�������ʵ�ֶ���ӿڡ�
	public void hunt(){//ʵ�ֽӿڵĳ��󷽷�
		System.out.println("ץ����");
	}
	public  void run(){
		System.out.println("�ٶ���"+SPEED);//SPEED�Ǵ�Runner�̳�������
	}
}
interface Hunter extends Runner{
	 void hunt();//�÷����ǳ��󷽷���Ĭ����oublic abstract
}
interface Runner{
	 int SPEED=100;//�������һ��������Ĭ����public static final
	 void run();
}