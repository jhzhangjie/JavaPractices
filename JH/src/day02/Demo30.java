package day02;
/**
 * 接口中只能定义抽象方法和常量。
 * 接口可以定义变量，但接口不能实例化，即只可能被实现；
 * 具体实现一个接口，必须要实现全部的抽象方法
 * 具体类可以实现多个接口，就是多继承现象；
 * imlemens实现，实际是继承关系；
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
       //new Runner();编译错误，不能创建接口的实现
	}

}
class Cat implements Hunter{//一个类可以实现多个接口。
	public void hunt(){//实现接口的抽象方法
		System.out.println("抓老鼠");
	}
	public  void run(){
		System.out.println("速度是"+SPEED);//SPEED是从Runner继承下来的
	}
}
interface Hunter extends Runner{
	 void hunt();//该方法是抽象方法，默认有oublic abstract
}
interface Runner{
	 int SPEED=100;//定义的是一个常量，默认有public static final
	 void run();
}