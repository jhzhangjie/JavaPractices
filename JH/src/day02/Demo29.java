package day02;
/**
 * ��ά���顣
 * 
 *
 */
public class Demo29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] ary=new int[][]{{2,5,6},{8,9,5}};//����һ����ά���飬����ʼ��
        ary[1]=new int[]{3,5,4,8};//�ı�ڶ��������ֵ
        System.out.println(ary[1][2]);
        System.out.println(ary.length);
        System.out.println(ary[0].length);
        System.out.println(ary[1].length);
        for(int i=0;i<ary.length;i++){
        	int[] temp=ary[i];
        	for(int j=0;j<temp.length;j++){
        		int n=temp[j];
        		System.out.print(n);
        	}
        	System.out.println();
        }
	}

}
