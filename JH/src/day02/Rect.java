package day02;

public class Rect extends Shape{
	int width;
	int heigth;
	public Rect(int x,int y,int w,int h){
		super.x=x;//���ʴӸ����м̳е�����
		this.y=y;//���ʵ�ǰ��������ԣ�y�̳��븸��
		this.width=w;
		heigth=h;
	}
   public double area(){
	   return width*heigth;
   }
   /**��д����ķ���*/
   public boolean contains(int x,int y){
	   int dx=x-this.x;
	   int dy=y-this.y;
	   return dx>=0 && dx<=width && dy>=0 && dy<=heigth;
   }
}
