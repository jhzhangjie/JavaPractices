package day02;
/**
 * ��̬����ʹ�����������ã���������ķ���
 * ��̬������û��this���������ܷ��ʵ�ǰ����
 * ��̬����һ�������뵱ǰ�����޹ع��߷�����
 * 
 * 
 *
 */
public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pooint4 c1=new Pooint4(3,4);
        Pooint4 c2=new Pooint4(5,7);
        System.out.println(c1.distance(c2));
        System.out.println(Pooint4.distance(c1,c2));//��̬����ʹ������������
	}

}
class Pooint4{
	int x;
	int y;
	public Pooint4(int x,int y){
		this.x=x;
		this.y=y;
	}
	//��̬������û����������this��������this����������Ժͷ���
	public static double distance(Pooint4 c1,Pooint4 c2){
		int a=c1.x-c2.x;
		int b=c1.y-c2.y;
		return Math.sqrt(a*a+b*b);
	}
	/**���㵱ǰ�㵽����һ��ľ��루other��*/
	public double distance(Pooint4 other){//distance()����һ���������������������Pooint.this
		int a=this.x-other.x;
		int b=this.y-other.y;
		return Math.sqrt(a*a+b*b);
	}
}