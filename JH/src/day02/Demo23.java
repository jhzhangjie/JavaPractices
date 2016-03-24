package day02;
/**
 * 属性绑定到变量的类型，由变量类型决定访问哪个属性
 * 方法动态绑定到对象，由对象的类型决定访问哪个方法
 *
 *
 */
public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cheater c=new Cheater();//此处new Cheater()定义的是对象，c是引用变量
        Person s=c;//此处s,c都是引用变量
        System.out.println(c.name+" "+s.name);//此处变量是谁就引用谁的属性
        c.put();//此处c对应的对象是谁就引用谁的方法。
        s.put();
        WWo h=new WWo();
        h.t(s);//重载的方法调用由参数类型决定，与对象无关。即此处函数参数s是Person类型，与对象Sub
	}

}
class Person{
	String name="小明";
	public void put(){
		System.out.println(name);
	}
			
}
class Cheater extends Person{
	String name="小孩";
	public void put(){
		System.out.println(name);
	}
}
class WWo{
	public void t(Person s){//方法的重载：函数类型，名字一样，函数参数不一样（个数，类型）
		System.out.println("你");
	}
	public void t(Cheater v){
		System.out.println("我");
	}
}