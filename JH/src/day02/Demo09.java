package day02;
/**
 *���췽����������������һ����������Сд�����ܶ��巵��ֵ 
 *���췽�������ã����ڴ������󣬳�ʼ����������
 *
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Point4 p1=new Point4(3,4);//new������ù��캯�������ض���
         p1.up(3);
         System.out.println(p1.y);
         Point4 p2=new Point4(5,5);
         p2.up(3);
         System.out.println(p2.y);
	}

}
class Point4{
	int x;int y;
	public Point4(int x,int y){//���캯��
		this.x=x;
		this.y=y;
	}
	public void up(int dy){
		this.y-=dy;
		
	}
}
