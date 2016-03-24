package day02;
/**
 * 1.静态类不能被继承。
 * 2.一个类的静态方法在子类中不能被重写。
 * 3.final修饰的变量只能初始化（即赋值一次），不能再修改
 * static final共同修饰的叫常量，称为只有一份并且不能修改
 *
 */
public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        final int a=5;//final定义的局部变量。
        //a=8;编译错误，因为final定义的变量不能被修改
        int b=5;
        b=12;
        b++;
        test(a,b);//静态方法需要类名来引用,其中类名可以省略
        Dog g=new Dog();
        Dog g1=new Dog();
        System.out.println(g.id + " " + g1.id + "" + Dog.numberOfdog);
	}
   public static void test(final int a,int b){//定义的是一个静态方法
	   //a++;编译错误。final定义的变量不能修改
	   System.out.println(a);
	   b++;
	   System.out.println(b);
   }
}
class Dog{
	final int id;//实例变量，每个对象都有一份，不能再次修改
	static int numberOfdog=0;//静态变量，共享一份
	public Dog(){
		id=numberOfdog++;
	}
}
