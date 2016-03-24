package day02;
/**
 * super()的语法
 * 
 *
 */
public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Aoo{}
class Boo extends Aoo{
	
	public Boo(){
		//System.out.println();
		super();//该函数用在子类构造函数的第一行
	}
	public Boo(int a){
		super();
	}
}