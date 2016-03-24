package day02;
/**
 * final 变量只能初始化一次，不能再修改。
 */
import java.util.Arrays;

public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String s="ABC";
        //s="A";final 定义的变量只能初始化一次，不能再修改
        final String[] ary={"A","B"};
        ary[0]="AS";//数组元素可以修改，
        //ary=null;数组变量不能再修改
        System.out.println(Arrays.toString(ary));
        System.out.println(s);
        final Hooo h=new Hooo();//此处final定义的h不能修改。
        
        h.s=7;//h里面定义的属性可以修改
        System.out.println(h.s);
	}

}
class Hooo{
	int s=4;
}