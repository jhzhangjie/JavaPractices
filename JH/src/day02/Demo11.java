package day02;
/**
 * ���캯���ǿ������ص�
 * 
 *
 */
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ԭ��
       Point5 p1=new Point5();
       //�����Խ�����һ��
       Point5 p2=new Point5(5,5);
       Point5 p3=new Point5(3);
       System.out.println(p1.x+","+p1.y);
       System.out.println(p2.x+","+p2.y);
       System.out.println(p3.x+","+p3.y);
	}

}
class Point5{
	int x;
	int y;
	public Point5(){
		this.x=0;
		this.y=0;
	}
	public Point5(int x,int y){
		this. x=x;
		this.y=y;
		
	}
	public Point5(int x){
		this.x=x;
		this.y=x;
		
	}
}