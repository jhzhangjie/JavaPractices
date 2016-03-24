package day02;
/**
 * 方法参数传递原理与this关键字
 *this是在方法调用期间代表当前对象，当方法调用结束时this就释放了
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 p=new Point3();
		p.x=5;
		p.y=9;
		p.up(3);
		System.out.println(p.x+","+p.y);
	}

}
class Point3{
	int x;
	int y;
	public void up(int dy){
		this.y-=dy;//this是方法中对当前对象的引用，本质是方法的隐藏参数
	}
}