package day02;
/**
 * 
 * ˽�з������ܼ̳�Ҳ���ܱ���д
 *
 */
public class Demo22 {

	public static void main(String[] args) {
	    SSP s=new SSP();//�����ͱ����������������
        //������AAP�������ķ�������������д�ķ�������̬�󶨵�SSP����ִ��SSP����ķ�����
	    s.test();
	}

}
class AAP{
	int a=2;
	public AAP(){
		System.out.println(a);
		this.test();}//��ʱthis���õ��������test()
	public void test(){//����˴���Public��Ϊprivate,��ô�����еķ����Ͳ�����д�ˡ�
		//��ô��ʱthis.test();���õľ��Ǹ����е�test()������
		System.out.println("AAP"+a);
	}
}
class SSP extends AAP{
	int b=3;
	public SSP(){super();}//Ĭ�ϵĹ��캯��������ûдҲ���е�
	public void test(){
		System.out.println("SSP"+a+""+b);
	}
}