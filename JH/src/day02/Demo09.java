package day02;
/**
 *构造方法：方法名与类名一样，包括大小写，不能定义返回值 
 *构造方法的作用：用于创建对象，初始化对象属性
 *
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Point4 p1=new Point4(3,4);//new运算调用构造函数，返回对象
         p1.up(3);
         System.out.println(p1.y);
         Point4 p2=new Point4(5,5);
         p2.up(3);
         System.out.println(p2.y);
	}

}
class Point4{
	int x;int y;
	public Point4(int x,int y){//构造函数
		this.x=x;
		this.y=y;
	}
	public void up(int dy){
		this.y-=dy;
		
	}
}
