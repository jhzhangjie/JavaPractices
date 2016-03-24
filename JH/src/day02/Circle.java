package day02;
/**
 * 圆继承了图形
 * 圆会自动继承父类型的属性和方法
 *其中shape称为父类型（Super class）
 *  Circle 称为子类型
 */
public class Circle extends Shape {
	int r;
    public Circle(int x,int y,int r){
    	this.x=x;
    	this.y=y;
    	this.r=r;
    }
    /**计算面积*/
    public double area(){
    	return 3.1415926*r*r;
    }
    /**重写父类型的方法*/
    public boolean contains(int x,int y){
    	int a=this.x-x;
    	int b=this.y-y;
    	double c=Math.sqrt(a*a + b*b);
    	return c<=r;
    }
}
