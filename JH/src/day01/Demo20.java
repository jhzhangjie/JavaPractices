package day01;
/**
 * while语句
 * 业务功能：将一个整数倒过来
 * 如：65721-》12756
 *    65721  1 -》1《-sum*10+1
 *    6572   2 -》12《-sum*10+2
 *    657    7 -》127<-sum*10+7
 *    65     5 -》1275<-sum*10+5
 *    6      6 -》12756<-sum*10+6
 *    0
 */

public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=65721;
        int sum=0;
        while(num!=0){//也可以把此语句写成：for(;num!=0;)
        	int last=num%10;//提取出最后一位
        	sum=sum*10+last;
        	num/=10;//消除最后一位
        	System.out.println(last+","+sum+","+num);
        	//跟踪语句，用于跟踪运行期间变量的值
        }
        System.out.println(sum);
	}

}
