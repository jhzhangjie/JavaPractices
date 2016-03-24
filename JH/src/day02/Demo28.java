package day02;

import java.util.Arrays;

public class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point45[] ary;//声明了数组变量
        ary=new Point45[3];//创建了数组对象
        //new Point4[3]实际情况：{null,null,null}
        //数组元素自动初始化为null，并不创建元素对象
        ary[0]=new Point45(2,5);
        ary[1]=new Point45(4,8);
        ary[2]=new Point45(7,2);
        System.out.println(Arrays.toString(ary));
        ary=new Point45[]{new Point45(4,6),new Point45(5,8)};//数组变量初始化
        Point45[] hi={new Point45(4,9),new Point45(6,1)};//定义变量并初始化。
	}

}
class Point45 {//当一个类没有继承任何父类时，自动继承object类。在objecct类中有toString()方法
	int x;
	int y;
	public Point45(){}
	public Point45(int x,int y){
		this.x=x;
		this.y=y;
	}
	//toString是object类定义的，此时子类继承该方法
	public String toString(){
		return"(" + x + "," + y + ")";
	}
}