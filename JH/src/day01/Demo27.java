package day01;

import java.util.Scanner;

/**
 * �ɼ����������Ӧ��
 * ������ƣ�ʹ������װ������
 * �㷨��ƣ�
 * 1����ʾ���˵���1.����2.�б�3.��ѯ0.�뿪
 * 2���ȴ����룬������ǲ˵���
 * 3����·���� �˵�����
 * 3.1�������빦�ܣ�
 * 3.2�����б���
 * 3.3�����ѯ����
 * 3.4�����뿪����
 * 4������1��
 *
 *3.1�������빦�ܣ���������ÿһλͬѧ�ĳɼ�
 *1����ʾ������ɼ�
 *2����ʾһλͬѧ�����֣��ȴ�������λͬѧ�ĳɼ���
 *3��������ĳɼ�д�뵽�ɼ�����
 *4�����ص�2��
 */
public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] names={"Tom","Jerry","John","Nemo","Andy","Lee"};
       int[] scores=new int[names.length];
       Scanner in=new Scanner(System.in);
       while(true){
    	   System.out.println("��������ʾ��"+"1.����2.�б�3.��ѯ0.�뿪");
    	   String cmd=in.nextLine();
    	   if(cmd.equals("0")){
    		   System.out.println("�뿪");
    	   }else if(cmd.equals("1")){
    		   System.out.println("����ɼ���");
    		   for(int i=0;i<scores.length;i++){
    			   System.out.print((i+1)+"."+names[i]+"�ɼ���");
    			   String s=in.nextLine();//���ַ�����ȡ
    			   //ParseInt��s������10���������ַ�����ת��Ϊ��������
    			   scores[i]=Integer.parseInt(s);
    			    }
    		   
    	   }else if(cmd.equals("2")){
    		   System.out.println("�����λͬѧ�ĳɼ���");
    		   int sum=0;
    		   for(int i=0;i<names.length;i++){
    			   System.out.println((i+1)+"."+names[i]+","+scores[i]);
    			   sum+=scores[i];
               }
    		   System.out.println("--------");
    		   System.out.println("ƽ���ɼ���"+sum/scores.length);
    	   }else if(cmd.equals("3")){
    		   System.out.println("��ѯĳλͬѧ�ĳɼ���");
    		   String name=in.nextLine();
    		   for(int i=0;i<names.length;i++){
    		   if(name.equals(names[i])){
    			   System.out.println((i+1)+"."+names[i]+","+scores[i]);
    			   break;
    		   }
    		   }
    	   }else{
    		   System.out.println("�������");
    	   }
       }
	}

}
