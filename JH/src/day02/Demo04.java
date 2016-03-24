package day02;
/**
 * 方法重载：方法名一样，参数不同的方法构成重载的方法，它主要用来实现类似功能。
 *        当调用方法时根据参数来确定调用的是哪个方法
 * 
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point2 p=new Point2();
        p.x=2;
        p.y=8;
        p.move();
        p.move(2);//此处的y值是p.move();函数执行后的值
        System.out.println(p.x+","+p.y);
        Point2 p1=new Point2();
        p1.x=2;
        p1.y=6;
        p1.move(3);
        System.out.println(p1.x+","+p1.y);
        }

}
class Point2{
	int x;
	int y;
	public void move(int n){
		y-=n;
	}
	public void move(){//方法的重载
		y--;
	}
}