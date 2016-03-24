package day01;
import java.util.Arrays;
/**
 * 
 *Arrays.equals()比较两个数组是否相等
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] answer={'A','B','C'};
        char[] input={'A','B','C','D'};
        boolean pass=Arrays.equals(answer,input);
        System.out.println(pass);
        
        input=new char[]{'A','B','C'};
        pass=Arrays.equals(answer,input);
        System.out.println(pass);//false
        
        input=new char[]{'A','C','B'};
        pass=Arrays.equals(answer,input);
        System.out.println(pass);//fa;se顺序不同
        
        Arrays.sort(input);//sort()是将字符数组由小到大的顺序排序
        pass=Arrays.equals(answer,input);
        System.out.println(pass);//ture
	}

}
