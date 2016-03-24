package day02;
/**
 * 
 * 私有方法不能继承也不能被重写
 *
 */
public class Demo22 {

	public static void main(String[] args) {
	    SSP s=new SSP();//父类型变量引用了子类对象
        //父类型AAP上声明的方法，子类型重写的方法。动态绑定到SSP对象，执行SSP对象的方法。
	    s.test();
	}

}
class AAP{
	int a=2;
	public AAP(){
		System.out.println(a);
		this.test();}//此时this调用的是子类的test()
	public void test(){//如果此处把Public改为private,那么子类中的方法就不是重写了。
		//那么此时this.test();调用的就是父类中的test()方法。
		System.out.println("AAP"+a);
	}
}
class SSP extends AAP{
	int b=3;
	public SSP(){super();}//默认的构造函数，就算没写也是有的
	public void test(){
		System.out.println("SSP"+a+""+b);
	}
}