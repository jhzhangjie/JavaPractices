package day02;
/**
 * 1.����ص�������
 * 2.�ֲ�����p1,p2��ջ�з���
 * 3.�����ڶ��д��������������Է���ռ�
 * 
 * �ڷ����ж���ı����оֲ�������main()�����ж���ı���Ҳ�Ǿֲ�����������p1,p2.��JAVA��û��ȫ�ֱ�����
 *
 *��Point
 *���ñ���p1,p2
 *����new point()
 *����ı����Ǹ������ݽṹ��װ�����ķ�װ(x,y)
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point p1;//���á����������Ƕ��������
        p1=new Point();//����
        System.out.println(p1.x+","+p1.y);//�˾�˵���������������Ĭ��ֵ�ġ�����Ĭ��ֵ��0
        p1.x=3;
        p1.y=4;
        Point p2=new Point();
        p2.x=4;
        p2.y=5;
        System.out.println(p2.x+","+p2.y);
        System.out.println(p1.x+","+p1.y);
        
	}

}
class Point{//������һ����
	int x;//�������������Ĭ��ֵ�ġ�����Ĭ��ֵ��0
	int y;
}