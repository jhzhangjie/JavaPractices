package day02;
/**
1)���캯���ǲ��ܼ̳е�
2�������͹��캯��Ĭ�ϵ��ø����͵��޲������캯��
*/
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Goo goo=new Goo(5);//�������Goo��myGoo��int�����캯��
		Goo goo=new Goo();//���õ�������Goo��Ĭ�Ϲ��캯�������Ǹ��๹�캯��
		Soo so=new Soo(5);
		Moo moo=new Moo();//�����͹��캯��Ĭ�ϵ��ø����͵��޲������캯��
	}

}
class Noo{
	public Noo(){System.out.println("CALL");}
}
class Moo extends Noo{
	public Moo(){}//���в�дҲ��������Ϊ������Ĭ�Ϲ��캯��
}
class Soo{
	public Soo(){}
	public Soo(int a){
		System.out.println("Call");
	}
}
class Goo extends Soo{}
	
