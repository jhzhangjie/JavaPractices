package day02;
/**
1)构造函数是不能继承的
2）子类型构造函数默认调用父类型的无参数构造函数
*/
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Goo goo=new Goo(5);//编译错误，Goo中myGoo（int）构造函数
		Goo goo=new Goo();//调用的是子类Goo的默认构造函数，不是父类构造函数
		Soo so=new Soo(5);
		Moo moo=new Moo();//子类型构造函数默认调用父类型的无参数构造函数
	}

}
class Noo{
	public Noo(){System.out.println("CALL");}
}
class Moo extends Noo{
	public Moo(){}//此行不写也是它，因为它就是默认构造函数
}
class Soo{
	public Soo(){}
	public Soo(int a){
		System.out.println("Call");
	}
}
class Goo extends Soo{}
	
