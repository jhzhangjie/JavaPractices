package day02;
/**
 * Demo12��Shape��Circle��ͬһ������
 * Circle���Դ�Shape�м̳����Ժͷ���
 * x���Ժ�up����������Shape�����Ժͷ���
 * 
 *
 */
public class Demo12 {
/**
 * �����Ͷ�����Ը�ֵ�������ͱ���
 *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c=new Circle(4,6,9);
        Shape s=c;//�����ͱ���s������������ʵ��
        //s��c������ͬһ������new Circle(4,6,9)
        
        s.up();//Circle��shape�м̳��˷���up()
        c.up(2);
        System.out.println(c.x+","+c.y+","+c.r);//Circle�̳���Shape��x
        
        
        //System.out.println(s.area());//�������
        //System.out.println(s.r);//�������
        System.out.println(c.area());
	}

}
