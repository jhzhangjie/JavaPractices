package day02;
/**
 * 引用类型变量的类型转换
 * 
 *
 */
public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle r=new Circle(4,6,8);
        Rect c=new Rect(14,5,6,8);
        Shape s=r;//子类类型变量可以赋值给父类
        Shape s1=c;
        //Circle r1=s;//编译错误，父类型变量不能赋值给子类型
        Circle x=(Circle)s;//执行正常
        //Circle y=(Circle)s1;//执行异常，类型转换异常
        //instanceof运算 ：检查变量引用的对象的类型是否兼容
        //s引用的是圆对象，s instanceof Circle检查s引用的对象是否是Circle类型的实例
        System.out.println(s instanceof Circle);//true
        System.out.println(s1 instanceof Circle);//false
	}
	public static void test(Shape s){
		if(s instanceof Circle){
			Circle c=(Circle)s;
			System.out.println("这是一个圆，面积:"+c.area());
		}
		if(s instanceof Circle){
			Rect r=(Rect)s;
			System.out.println("这是个矩形："+r.area());
		}
	}

}
