package day02;
/**
 * 匿名内部类==内部类
 * new Uoo(){}就叫匿名内部类，它是继承Uoo类的子类，并且同时创建子类型的实例。其中{}是子类型的类体；
 * 
 *
 */
public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Uoo u=new Uoo();//创建Uoo实例
        Uoo u1=new Uoo(){};//创建匿名内部类实例
        Uoo u2=new Uoo(){
        	public void test(){//方法的重写
        		System.out.println("U2.test（）");
        	}
        };
        u2.test();//调用在匿名内部类中重写的方法
        Doo7 d=new Doo7(){
        	public void test(){
        		System.out.println("输出test");
        	}
        };
        d.test();
	}

}
interface Doo7{
	void test();
}
class Uoo{
	void test(){}
}