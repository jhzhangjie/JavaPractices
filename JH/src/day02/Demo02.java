package day02;

/**
 * �������Ĭ��ֵ
 * 
 *
 */

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Foo b=new Foo();
        System.out.println(b.i);//Ĭ��ֵ��0
        System.out.println(b.j);//Ĭ��ֵ��o.0
        System.out.println(b.h);
        System.out.println((int)b.c);//�ַ��͵�Ĭ��ֵ����ֱ�������
        System.out.println(b.f);//�ַ�����Ĭ��ֵ��null,null��ʾû��
        int a;//�ֲ�������main()�����������ľֲ�����������ջ�з���
	}

}
class Foo{
	int i;//������������ʵ�б�����ʵ��Ҳ�ƶ���
	float j;
	double h;
	char c;
	String f;
}