package day02;
/**
 * 静态方法使用类名来调用，是属于类的方法
 * 静态方法中没有this变量，不能访问当前对象
 * 静态方法一般用于与当前对象无关工具方法数
 * 
 * 
 *
 */
public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pooint4 c1=new Pooint4(3,4);
        Pooint4 c2=new Pooint4(5,7);
        System.out.println(c1.distance(c2));
        System.out.println(Pooint4.distance(c1,c2));//静态方法使用类名来调用
	}

}
class Pooint4{
	int x;
	int y;
	public Pooint4(int x,int y){
		this.x=x;
		this.y=y;
	}
	//静态方法中没有隐含参数this，不能用this访问类的属性和方法
	public static double distance(Pooint4 c1,Pooint4 c2){
		int a=c1.x-c2.x;
		int b=c1.y-c2.y;
		return Math.sqrt(a*a+b*b);
	}
	/**计算当前点到另外一点的距离（other）*/
	public double distance(Pooint4 other){//distance()中有一个隐含参数，这个参数是Pooint.this
		int a=this.x-other.x;
		int b=this.y-other.y;
		return Math.sqrt(a*a+b*b);
	}
}