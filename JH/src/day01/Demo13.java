package day01;
import java.util.Scanner;
/**
 * ��������˰����
 * @author JH
 *
 */

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consloe=new Scanner(System.in);
		System.out.println("����˰ǰн�ʣ�");
        double salary=consloe.nextDouble();//нˮ
        double income;//����
        double tax=0.0;//˰
        double taxIncome=salary-3500;//Ӧ˰����
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
        System.out.println("˰��"+tax+""+"���룺"+income);
        
        
        
	}

}
