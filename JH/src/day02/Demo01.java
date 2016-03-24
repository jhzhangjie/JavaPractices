package day02;
/**
 * 1.类加载到方法区
 * 2.局部变量p1,p2在栈中分配
 * 3.对象在堆中创建，对象按照属性分配空间
 * 
 * 在方法中定义的变量叫局部变量，main()方法中定义的变量也是局部变量。比如p1,p2.在JAVA中没有全局变量。
 *
 *类Point
 *引用变量p1,p2
 *对象new point()
 *对象的本质是复合数据结构封装。如点的封装(x,y)
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point p1;//引用“变量”，是对象的名字
        p1=new Point();//对象
        System.out.println(p1.x+","+p1.y);//此句说明对象的属性是有默认值的。它的默认值是0
        p1.x=3;
        p1.y=4;
        Point p2=new Point();
        p2.x=4;
        p2.y=5;
        System.out.println(p2.x+","+p2.y);
        System.out.println(p1.x+","+p1.y);
        
	}

}
class Point{//定义了一个类
	int x;//对象的属性是有默认值的。它的默认值是0
	int y;
}