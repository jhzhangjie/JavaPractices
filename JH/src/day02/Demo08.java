package day02;
/**
 * null与空指针异常
 * 
 *引用变量不是对象，引用变量在运行期间动态绑定到对象
 *当变量的值是null时候，调用了变量的属性或者方法，会出现空指针异常！ 
 * 
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1;
        //System.out.println(s1);//编译错误，变量没有初始化
        s1=null;//引用类型变量可以赋值为null,nill就是没有
       // s1=null;表示s1没有引用任何字符串对象
        //s1.charAt(0);表示取字符串s1中第一个字符
        //运行异常，因为s1中没有任何内容，此时会出现空指针异常
        test("Hi");
        test(s1);//运行异常，空指针异常
	}
	public static void test(String s){
		//s变量不是字符串对象，在运行期间动态绑定到对象
		System.out.println(s.charAt(0));//在s的值是null时候异常
	}

}
