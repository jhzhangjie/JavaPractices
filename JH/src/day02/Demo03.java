package day02;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Point1 p1=new Point1();
         p1.x=5;
         p1.y=19;
         p1.up(2);
         p1.left(1);
         System.out.println(p1.x+","+p1.y);
         Point1 p2=new Point1();
         p2.x=7;
         p2.y=24;
         p2.up(4);
         //up()方法的运算修改当前对象的属性y
         p2.left(5);
         System.out.println(p2.x+","+p2.y);
	}

}
//class Point{}编译错误，在一个包中不能有同名的类
class Point1{
	int x;
	int y;
	public void up(int y1){
		y-=y1;
	}
	public void left(int x1){
		x-=x1;
	}
}