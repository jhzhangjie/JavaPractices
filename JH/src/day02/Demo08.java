package day02;
/**
 * null���ָ���쳣
 * 
 *���ñ������Ƕ������ñ����������ڼ䶯̬�󶨵�����
 *��������ֵ��nullʱ�򣬵����˱��������Ի��߷���������ֿ�ָ���쳣�� 
 * 
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1;
        //System.out.println(s1);//������󣬱���û�г�ʼ��
        s1=null;//�������ͱ������Ը�ֵΪnull,nill����û��
       // s1=null;��ʾs1û�������κ��ַ�������
        //s1.charAt(0);��ʾȡ�ַ���s1�е�һ���ַ�
        //�����쳣����Ϊs1��û���κ����ݣ���ʱ����ֿ�ָ���쳣
        test("Hi");
        test(s1);//�����쳣����ָ���쳣
	}
	public static void test(String s){
		//s���������ַ��������������ڼ䶯̬�󶨵�����
		System.out.println(s.charAt(0));//��s��ֵ��nullʱ���쳣
	}

}
