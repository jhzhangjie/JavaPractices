package day01;
import java.util.Arrays;
/**
 * Arrays.binarySearch()���ֲ��ҷ���
 *
 *ע�⣺��δ�����������ʹ��2�ֲ��ң�������ȶ�������ʹ��
 */

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] hotel={"Tom","Nemo","John","Jerry","Andy"};
        System.out.println(Arrays.binarySearch(hotel,"Andy"));
      //��Ϊ����δ���򣬵�����Andyʱ��Ӧ����John������ҡ�������߲�����Andy,�򷵻ظ�����
        System.out.println(Arrays.binarySearch(hotel, "Tom"));
        Arrays.sort(hotel);
        System.out.println(Arrays.binarySearch(hotel,"Andy"));
        System.out.println(Arrays.binarySearch(hotel, "Tom"));
        System.out.println(Arrays.binarySearch(hotel, "Lee"));
        //Lee�����ڣ��򷵻ظ���
	}

}
