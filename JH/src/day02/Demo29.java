package day02;
/**
 * 二维数组。
 * 
 *
 */
public class Demo29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] ary=new int[][]{{2,5,6},{8,9,5}};//定义一个二维数组，并初始化
        ary[1]=new int[]{3,5,4,8};//改变第二个数组的值
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
