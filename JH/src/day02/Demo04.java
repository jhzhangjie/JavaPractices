package day02;
/**
 * �������أ�������һ����������ͬ�ķ����������صķ���������Ҫ����ʵ�����ƹ��ܡ�
 *        �����÷���ʱ���ݲ�����ȷ�����õ����ĸ�����
 * 
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point2 p=new Point2();
        p.x=2;
        p.y=8;
        p.move();
        p.move(2);//�˴���yֵ��p.move();����ִ�к��ֵ
        System.out.println(p.x+","+p.y);
        Point2 p1=new Point2();
        p1.x=2;
        p1.y=6;
        p1.move(3);
        System.out.println(p1.x+","+p1.y);
        }

}
class Point2{
	int x;
	int y;
	public void move(int n){
		y-=n;
	}
	public void move(){//����������
		y--;
	}
}