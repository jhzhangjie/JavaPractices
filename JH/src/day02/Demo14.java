package day02;
/**
 * 1)��һ���й�����
 * 2������һ�����ø��๹����
 * 2.1����Ĭ�ϵ��ø����޲���������
 * 2.2�������û���޲ι�����������ʹ��super()���ø��๹����
 * super()һ�������๹������һ��ʹ�ã����û��Ĭ�ϴ���super()
 *
 */
public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Yoo();
	}

}
class Xoo{
	public Xoo(int s){
		System.out.println("CALL");
	}
}
class Yoo extends Xoo{
	//public Yoo(){}//�������������ò���������޲ι��캯��
	public Yoo(){
	  // super();//�������������ò���������޲ι��캯��
	   super(100);
}
}
