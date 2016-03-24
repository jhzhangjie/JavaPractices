package day02;
/**
 * 1)类一定有构造器
 * 2）子类一定调用父类构造器
 * 2.1子类默认调用父类无参数构造器
 * 2.2如果父类没有无参构造器，必须使用super()调用父类构造器
 * super()一定在子类构造器第一行使用，如果没有默认存在super()
 *
 */
public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Yoo();
	}

}
class Xoo{
	public Xoo(int s){
		System.out.println("CALL");
	}
}
class Yoo extends Xoo{
	//public Yoo(){}//编译错误，子类调用不到父类的无参构造函数
	public Yoo(){
	  // super();//编译错误，子类调用不到父类的无参构造函数
	   super(100);
}
}
