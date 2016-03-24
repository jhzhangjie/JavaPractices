package day02;

/**
 * 测试类的默认值
 * 
 *
 */

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Foo b=new Foo();
        System.out.println(b.i);//默认值是0
        System.out.println(b.j);//默认值是o.0
        System.out.println(b.h);
        System.out.println((int)b.c);//字符型的默认值不能直接输出。
        System.out.println(b.f);//字符串的默认值是null,null表示没有
        int a;//局部变量：main()方法中声明的局部变量，它在栈中分配
	}

}
class Foo{
	int i;//是类中声明的实列变量（实列也称对象）
	float j;
	double h;
	char c;
	String f;
}