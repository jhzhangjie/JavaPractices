package day01;
import java.util.Arrays;
/**
 * 
 *Arrays.equals()�Ƚ����������Ƿ����
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
        System.out.println(pass);//fa;se˳��ͬ
        
        Arrays.sort(input);//sort()�ǽ��ַ�������С�����˳������
        pass=Arrays.equals(answer,input);
        System.out.println(pass);//ture
	}

}
