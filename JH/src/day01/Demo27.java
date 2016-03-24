package day01;

import java.util.Scanner;

/**
 * 成绩管理：数组的应用
 * 数据设计：使用叔祖装载数据
 * 算法设计：
 * 1）提示主菜单：1.输入2.列表3.查询0.离开
 * 2）等待输入，输入的是菜单号
 * 3）多路处理 菜单功能
 * 3.1处理输入功能：
 * 3.2处理列表功能
 * 3.3处理查询功能
 * 3.4处理离开功能
 * 4）返回1）
 *
 *3.1处理输入功能，迭代输入每一位同学的成绩
 *1）提示“输入成绩
 *2）提示一位同学的名字，等待输入这位同学的成绩”
 *3）将输入的成绩写入到成绩数组
 *4）返回到2）
 */
public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] names={"Tom","Jerry","John","Nemo","Andy","Lee"};
       int[] scores=new int[names.length];
       Scanner in=new Scanner(System.in);
       while(true){
    	   System.out.println("请输入提示："+"1.输入2.列表3.查询0.离开");
    	   String cmd=in.nextLine();
    	   if(cmd.equals("0")){
    		   System.out.println("离开");
    	   }else if(cmd.equals("1")){
    		   System.out.println("输入成绩：");
    		   for(int i=0;i<scores.length;i++){
    			   System.out.print((i+1)+"."+names[i]+"成绩：");
    			   String s=in.nextLine();//按字符串读取
    			   //ParseInt（s）将“10进制整数字符串”转换为整形数据
    			   scores[i]=Integer.parseInt(s);
    			    }
    		   
    	   }else if(cmd.equals("2")){
    		   System.out.println("输出各位同学的成绩：");
    		   int sum=0;
    		   for(int i=0;i<names.length;i++){
    			   System.out.println((i+1)+"."+names[i]+","+scores[i]);
    			   sum+=scores[i];
               }
    		   System.out.println("--------");
    		   System.out.println("平均成绩："+sum/scores.length);
    	   }else if(cmd.equals("3")){
    		   System.out.println("查询某位同学的成绩：");
    		   String name=in.nextLine();
    		   for(int i=0;i<names.length;i++){
    		   if(name.equals(names[i])){
    			   System.out.println((i+1)+"."+names[i]+","+scores[i]);
    			   break;
    		   }
    		   }
    	   }else{
    		   System.out.println("输入错误！");
    	   }
       }
	}

}
