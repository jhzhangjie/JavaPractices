package day02;
/**
 * �������ͱ���������ת��
 * 
 *
 */
public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle r=new Circle(4,6,8);
        Rect c=new Rect(14,5,6,8);
        Shape s=r;//�������ͱ������Ը�ֵ������
        Shape s1=c;
        //Circle r1=s;//������󣬸����ͱ������ܸ�ֵ��������
        Circle x=(Circle)s;//ִ������
        //Circle y=(Circle)s1;//ִ���쳣������ת���쳣
        //instanceof���� �����������õĶ���������Ƿ����
        //s���õ���Բ����s instanceof Circle���s���õĶ����Ƿ���Circle���͵�ʵ��
        System.out.println(s instanceof Circle);//true
        System.out.println(s1 instanceof Circle);//false
	}
	public static void test(Shape s){
		if(s instanceof Circle){
			Circle c=(Circle)s;
			System.out.println("����һ��Բ�����:"+c.area());
		}
		if(s instanceof Circle){
			Rect r=(Rect)s;
			System.out.println("���Ǹ����Σ�"+r.area());
		}
	}

}
