package day02;
/**
 *ͼ�� ���� ����x,y����ͼ�ε�λ��
 *ͼ����Ϊ�����ͣ���Բ�;��μ̳� 
 * 
 *
 */
public class Shape {
    int x;
    int y;
    /**
     * 
     * ͼ�������ƶ��� 
     */
    public void up(int dy){
    	y-=dy;
    }
    public void up(){
    	y--;
    }
    /**��鵱ǰͼ���Ƿ�������꣨x,y��*/
    public boolean contains(int x,int y){
    	return false;
    }
}
