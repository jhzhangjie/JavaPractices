package day02;

import java.util.Arrays;

public class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point45[] ary;//�������������
        ary=new Point45[3];//�������������
        //new Point4[3]ʵ�������{null,null,null}
        //����Ԫ���Զ���ʼ��Ϊnull����������Ԫ�ض���
        ary[0]=new Point45(2,5);
        ary[1]=new Point45(4,8);
        ary[2]=new Point45(7,2);
        System.out.println(Arrays.toString(ary));
        ary=new Point45[]{new Point45(4,6),new Point45(5,8)};//���������ʼ��
        Point45[] hi={new Point45(4,9),new Point45(6,1)};//�����������ʼ����
	}

}
class Point45 {//��һ����û�м̳��κθ���ʱ���Զ��̳�object�ࡣ��objecct������toString()����
	int x;
	int y;
	public Point45(){}
	public Point45(int x,int y){
		this.x=x;
		this.y=y;
	}
	//toString��object�ඨ��ģ���ʱ����̳и÷���
	public String toString(){
		return"(" + x + "," + y + ")";
	}
}