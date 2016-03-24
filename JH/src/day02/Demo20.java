package day02;
/**
 * 重写方法的调用
 * 
 *
 */

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle(3,4,5);//把子类对象赋值给父类
		Shape s2=new Rect(3,4,6,5);
        System.out.println(s1.contains(1,1));//此时调用的是子类的重写方法
        System.out.println(s2.contains(16,9));
        print(new Circle(5,5,4),new Rect(5,5,6,7));
        print(new Rect(5,5,6,7),new Circle(5,5,4));
	}
        public static void print(Shape h1,Shape h2){//父类型变量可以引用各种各样的子类型实例，此处就是多态的体现
        	for(int x=0;x<20;x++){
        		for(int y=0;y<20;y++){
        			//重写的方法在运行期间动态绑定到对象的方法
        			if(h1.contains(x, y) && h2.contains(x, y)){
        				//此处是行为的多态，根据传入的对象来判断调用的是哪个contains函数。
        				System.out.print("+");
        			}else if(h1.contains(x, y)){
        				System.out.print("-");
        			}else if(h2.contains(x, y)){
        				System.out.print("|");
        			}else{
        				System.out.print(" ");
        			}
        		}
        		System.out.println();
        	}
        }
}
