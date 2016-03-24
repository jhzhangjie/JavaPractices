package day01;

import java.util.Arrays;

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] player1=new int[4];
     Arrays.fill(player1, 100);//数组player1的元素全是100
     int[] player2=player1;//此时player1和player2指向的地址是相同的
     player1[0]-=50;
     System.out.println(Arrays.toString(player1));//toString连接字符数组为字符串
     System.out.println(Arrays.toString(player2));
     
     int[] player3=new int[player1.length];
     System.arraycopy( player1, 0, player3, 0,player1.length);
     //arraycopy()是将数组player1中元素从0开始复制个数为player1.length的元素给playear3
     player1[2]-=10;
     System.out.println(Arrays.toString(player1));
     System.out.println(Arrays.toString(player3));
     
     //Arrrays类提供了“更加便捷”数组复制方法，底层是System.arraycopy,copyof()
     int[] player4=Arrays.copyOf(player1,player1.length);
     System.out.println(Arrays.toString(player4));
	}

}
