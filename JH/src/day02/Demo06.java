package day02;
/**
 * ������������ԭ����this�ؼ���
 *this���ڷ��������ڼ����ǰ���󣬵��������ý���ʱthis���ͷ���
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 p=new Point3();
		p.x=5;
		p.y=9;
		p.up(3);
		System.out.println(p.x+","+p.y);
	}

}
class Point3{
	int x;
	int y;
	public void up(int dy){
		this.y-=dy;//this�Ƿ����жԵ�ǰ��������ã������Ƿ��������ز���
	}
}