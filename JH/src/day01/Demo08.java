package day01;

import java.util.Arrays;

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] player1=new int[4];
     Arrays.fill(player1, 100);//����player1��Ԫ��ȫ��100
     int[] player2=player1;//��ʱplayer1��player2ָ��ĵ�ַ����ͬ��
     player1[0]-=50;
     System.out.println(Arrays.toString(player1));//toString�����ַ�����Ϊ�ַ���
     System.out.println(Arrays.toString(player2));
     
     int[] player3=new int[player1.length];
     System.arraycopy( player1, 0, player3, 0,player1.length);
     //arraycopy()�ǽ�����player1��Ԫ�ش�0��ʼ���Ƹ���Ϊplayer1.length��Ԫ�ظ�playear3
     player1[2]-=10;
     System.out.println(Arrays.toString(player1));
     System.out.println(Arrays.toString(player3));
     
     //Arrrays���ṩ�ˡ����ӱ�ݡ����鸴�Ʒ������ײ���System.arraycopy,copyof()
     int[] player4=Arrays.copyOf(player1,player1.length);
     System.out.println(Arrays.toString(player4));
	}

}
