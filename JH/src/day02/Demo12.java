package day02;
/**
 * Demo12与Shape和Circle在同一个包中
 * Circle可以从Shape中继承属性和方法
 * x属性和up方法定义在Shape中属性和方法
 * 
 *
 */
public class Demo12 {
/**
 * 子类型对象可以赋值给父类型变量
 *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c=new Circle(4,6,9);
        Shape s=c;//父类型变量s引用了子类型实例
        //s和c引用了同一个对象new Circle(4,6,9)
        
        s.up();//Circle从shape中继承了方法up()
        c.up(2);
        System.out.println(c.x+","+c.y+","+c.r);//Circle继承了Shape中x
        
        
        //System.out.println(s.area());//编译错误
        //System.out.println(s.r);//编译错误
        System.out.println(c.area());
	}

}
