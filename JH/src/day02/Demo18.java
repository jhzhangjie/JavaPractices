package day02;
/**
 * ��1�����������ܼ̳�
 * ��2��������Ĭ�ϵ��ø������޲������캯��
 *
 */
public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Goo s=new Goo(8);//�������˵�����಻�ܼ̳и���Ĺ�����
		Too s=new Too();//������Լ̳и����Ĭ�Ϲ�����
		Hoo m=new Hoo();
	}

}
class Joo{
	public Joo(){System.out.println("����");}
}
class Hoo extends Joo{}
class Eoo{
	public Eoo(){};
	public Eoo(int a){
        System.out.println("D");
	}
}
class Too extends Eoo{
	
}