package day02;
/**
 * ��д�����ĵ���
 * 
 *
 */

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle(3,4,5);//���������ֵ������
		Shape s2=new Rect(3,4,6,5);
        System.out.println(s1.contains(1,1));//��ʱ���õ����������д����
        System.out.println(s2.contains(16,9));
        print(new Circle(5,5,4),new Rect(5,5,6,7));
        print(new Rect(5,5,6,7),new Circle(5,5,4));
	}
        public static void print(Shape h1,Shape h2){//�����ͱ����������ø��ָ�����������ʵ�����˴����Ƕ�̬������
        	for(int x=0;x<20;x++){
        		for(int y=0;y<20;y++){
        			//��д�ķ����������ڼ䶯̬�󶨵�����ķ���
        			if(h1.contains(x, y) && h2.contains(x, y)){
        				//�˴�����Ϊ�Ķ�̬�����ݴ���Ķ������жϵ��õ����ĸ�contains������
        				System.out.print("+");
        			}else if(h1.contains(x, y)){
        				System.out.print("-");
        			}else if(h2.contains(x, y)){
        				System.out.print("|");
        			}else{
        				System.out.print(" ");
        			}
        		}
        		System.out.println();
        	}
        }
}
