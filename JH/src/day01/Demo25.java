package day01;
/**
 * ����ġ������������ظ�������߱�����
 * ����ĵ�������һ���������ÿ��Ԫ��
 * 
 *ͳ�Ʒ���������
 *����һ��ѧ���ķ�����
 *       ��ѧ   ����     Ӣ��  ��Ȼ
 *score={65.5,75.5,88,93}
 */
public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] score={65.5,75.5,88,93};
        double sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        	
        }
        System.out.println("ƽ���֣�"+sum/score.length);
	}

}
