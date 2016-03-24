package day02;
/**
 * 静态变量：静态变量只有一份
 * 1.静态变量在类加载期间初始化，存在方法区中
 * 2.是全体对象共享的一份变量
 * 3.经常使用类名访问静态变量
 * 
 *
 */

public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat2 t1=new Cat2(5);
        Cat2 t2=new Cat2(7);
        System.out.println(t1.age + " " + t2.age + " " + Cat2.NumberOfCat);
	}

}
class Cat2{
	int age;//实例变量，每个对象有一份
	static int NumberOfCat=0;//静态变量，只有一份
	public Cat2(int age){
		this.age=age;
		NumberOfCat++;
	}
}