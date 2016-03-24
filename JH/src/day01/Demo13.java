package day01;
import java.util.Scanner;
/**
 * 个人所得税计算
 * @author JH
 *
 */

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consloe=new Scanner(System.in);
		System.out.println("输入税前薪资：");
        double salary=consloe.nextDouble();//薪水
        double income;//收入
        double tax=0.0;//税
        double taxIncome=salary-3500;//应税收入
        if(taxIncome<=0){
        	tax=0.0;
        }else if(taxIncome<1500){
        	tax=taxIncome*(3.0/100);
        }else if(taxIncome<4500){
        	tax=taxIncome*0.1-105;
        }else if(taxIncome<9000){
        	tax=taxIncome*0.2-555;
        }else if(taxIncome<35000){
        	tax=taxIncome*0.25-1005;
        }else{
        	tax=taxIncome*0.3-2755;
        	
        }
        income=salary-tax;
        System.out.println("税："+tax+""+"收入："+income);
        
        
        
	}

}
