package day01;
import java.util.Scanner;
/**
 * switch case
 * @author JH
 *��ʾ���������ݷ�������
 *������������  ����  �е� ����  ������
 */

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("����ɼ���");
		int score=console.nextInt();
        String level;
        switch(score/10){
        case 10:
        case 9:
        	level ="����";break;
        case 8:
        	level="����";break;
        case 7:
        	level="�е�";break;
        case 6:
        	level="����";break;
        default:
        	level="������";
        }
        System.out.println(level);
	}

}
