package day02;
/**
 * （1）构造器不能继承
 * （2）子类型默认调用父类型无参数构造函数
 *
 */
public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Goo s=new Goo(8);//编译错误，说明子类不能继承父类的构造器
		Too s=new Too();//子类可以继承父类的默认构造器
		Hoo m=new Hoo();
	}

}
class Joo{
	public Joo(){System.out.println("机柜");}
}
class Hoo extends Joo{}
class Eoo{
	public Eoo(){};
	public Eoo(int a){
        System.out.println("D");
	}
}
class Too extends Eoo{
	
}