package day02;
/**
 * Ĭ�Ϲ��캯�������޲������������ǿյ�
 * 1����һ���й��캯��
 * A�������û�������κεĹ��캯����JAVA���������Զ�����Ĭ�Ϲ��캯��
 * B������������˹��캯����JAVA�������������ṩĬ�Ϲ��캯��
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Poo foo=new Poo();//����JAVA�Զ���ӵ�Ĭ�Ϲ�����
       //Koo koo=new Koo();//�������û��Koo()���������
       Koo koo=new Koo(8);
	}

}
class Poo{}//�й����������޲ε�Ĭ�Ϲ�����
class Koo{
	public Koo(int a){//�������в����Ĺ�����
		System.out.println("CALL Koo(int)");
	}
}
