package day02;
/**
 * 继承的时候对象的创建过程
 * 1.JAVA首先递归加载所有类搭配方法区
 * 2.分配父子类型的内存
 * 3.递归调用构造器
 * 
 *
 */
public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Doo n=new Doo();
        System.out.println(n.a+" "+n.b+" "+n.c);
	}

}
class Woo{
	int a=2;
	public Woo(){
		System.out.println(a);//跟踪语句，此处a=2
		}
}
class Qoo extends Woo{
	int b=3;
	public Qoo(){
		super();//这个函数不写也会默认添加的
		a=4;
		b=6;
		System.out.println(a+" "+b);//跟踪语句，此处a=4,b=6;
	}
}
class Doo extends Qoo{
	int c=8;
	 public Doo(){
		 super();
		 a=1;b=9;c=10;
	 }
}