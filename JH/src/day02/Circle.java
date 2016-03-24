package day02;
/**
 * Բ�̳���ͼ��
 * Բ���Զ��̳и����͵����Ժͷ���
 *����shape��Ϊ�����ͣ�Super class��
 *  Circle ��Ϊ������
 */
public class Circle extends Shape {
	int r;
    public Circle(int x,int y,int r){
    	this.x=x;
    	this.y=y;
    	this.r=r;
    }
    /**�������*/
    public double area(){
    	return 3.1415926*r*r;
    }
    /**��д�����͵ķ���*/
    public boolean contains(int x,int y){
    	int a=this.x-x;
    	int b=this.y-y;
    	double c=Math.sqrt(a*a + b*b);
    	return c<=r;
    }
}
