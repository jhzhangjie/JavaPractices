package day02;
/**
 * this()���ñ�����������캯��
 * ���ղ������ù��캯���������ڹ��캯����ʹ�ã������ڵ�һ��ʹ�á�
 * this()��super()����
 * this.�Ƿ��ʵ�ǰ����
 * this()�ǵ��ñ��๹�캯��
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cell c=new Cell();//���õ����޲ι��캯��
         System.out.println(c.x+","+c.y);
         
	}

}
class Cell{
	int x;int y;
	public Cell(){
		this(1,1);//�ú������ñ�����������캯��
	}
	public Cell(int x,int y){
		this. x=x;
		this.y=y;
		
		
	}
}