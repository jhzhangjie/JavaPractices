package day02;
/**
 * this()调用本类的其他构造函数
 * 按照参数调用构造函数，必须在构造函数中使用，必须在第一行使用。
 * this()与super()互斥
 * this.是访问当前对象
 * this()是调用本类构造函数
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cell c=new Cell();//调用的是无参构造函数
         System.out.println(c.x+","+c.y);
         
	}

}
class Cell{
	int x;int y;
	public Cell(){
		this(1,1);//该函数调用本类的其他构造函数
	}
	public Cell(int x,int y){
		this. x=x;
		this.y=y;
		
		
	}
}