package day02;
/**
 * ���԰󶨵����������ͣ��ɱ������;��������ĸ�����
 * ������̬�󶨵������ɶ�������;��������ĸ�����
 *
 *
 */
public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cheater c=new Cheater();//�˴�new Cheater()������Ƕ���c�����ñ���
        Person s=c;//�˴�s,c�������ñ���
        System.out.println(c.name+" "+s.name);//�˴�������˭������˭������
        c.put();//�˴�c��Ӧ�Ķ�����˭������˭�ķ�����
        s.put();
        WWo h=new WWo();
        h.t(s);//���صķ��������ɲ������;�����������޹ء����˴���������s��Person���ͣ������Sub
	}

}
class Person{
	String name="С��";
	public void put(){
		System.out.println(name);
	}
			
}
class Cheater extends Person{
	String name="С��";
	public void put(){
		System.out.println(name);
	}
}
class WWo{
	public void t(Person s){//���������أ��������ͣ�����һ��������������һ�������������ͣ�
		System.out.println("��");
	}
	public void t(Cheater v){
		System.out.println("��");
	}
}