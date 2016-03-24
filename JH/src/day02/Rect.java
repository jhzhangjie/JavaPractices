package day02;

public class Rect extends Shape{
	int width;
	int heigth;
	public Rect(int x,int y,int w,int h){
		super.x=x;//访问从父类中继承的属性
		this.y=y;//访问当前对象的属性，y继承与父类
		this.width=w;
		heigth=h;
	}
   public double area(){
	   return width*heigth;
   }
   /**重写父类的方法*/
   public boolean contains(int x,int y){
	   int dx=x-this.x;
	   int dy=y-this.y;
	   return dx>=0 && dx<=width && dy>=0 && dy<=heigth;
   }
}
