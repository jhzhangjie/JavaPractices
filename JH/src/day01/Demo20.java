package day01;
/**
 * while���
 * ҵ���ܣ���һ������������
 * �磺65721-��12756
 *    65721  1 -��1��-sum*10+1
 *    6572   2 -��12��-sum*10+2
 *    657    7 -��127<-sum*10+7
 *    65     5 -��1275<-sum*10+5
 *    6      6 -��12756<-sum*10+6
 *    0
 */

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=65721;
        int sum=0;
        while(num!=0){//Ҳ���԰Ѵ����д�ɣ�for(;num!=0;)
        	int last=num%10;//��ȡ�����һλ
        	sum=sum*10+last;
        	num/=10;//�������һλ
        	System.out.println(last+","+sum+","+num);
        	//������䣬���ڸ��������ڼ������ֵ
        }
        System.out.println(sum);
	}

}
