package day02;
/**
 * ��̬��������̬����ֻ��һ��
 * 1.��̬������������ڼ��ʼ�������ڷ�������
 * 2.��ȫ��������һ�ݱ���
 * 3.����ʹ���������ʾ�̬����
 * 
 *
 */

public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat2 t1=new Cat2(5);
        Cat2 t2=new Cat2(7);
        System.out.println(t1.age + " " + t2.age + " " + Cat2.NumberOfCat);
	}

}
class Cat2{
	int age;//ʵ��������ÿ��������һ��
	static int NumberOfCat=0;//��̬������ֻ��һ��
	public Cat2(int age){
		this.age=age;
		NumberOfCat++;
	}
}