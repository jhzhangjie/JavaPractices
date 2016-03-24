package day02;
/**
 * 默认构造函数：是无参数，方法体是空的
 * 1，类一定有构造函数
 * A。如果累没有申明任何的构造函数，JAVA编译器会自动插入默认构造函数
 * B。如果类申明了构造函数，JAVA编译器将不再提供默认构造函数
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Poo foo=new Poo();//调用JAVA自动添加的默认构造器
       //Koo koo=new Koo();//编译错误，没有Koo()这个构造器
       Koo koo=new Koo(8);
	}

}
class Poo{}//有构造器，有无参的默认构造器
class Koo{
	public Koo(int a){//申明了有参数的构造器
		System.out.println("CALL Koo(int)");
	}
}
