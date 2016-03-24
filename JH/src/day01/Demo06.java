package day01;
import java.util.Arrays;
/**
 * Arrays.binarySearch()二分查找方法
 *
 *注意：在未排序的数组上使用2分查找，结果不稳定，不能使用
 */

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] hotel={"Tom","Nemo","John","Jerry","Andy"};
        System.out.println(Arrays.binarySearch(hotel,"Andy"));
      //因为数组未排序，当查找Andy时，应该在John的左边找。由于左边不存在Andy,则返回负数。
        System.out.println(Arrays.binarySearch(hotel, "Tom"));
        Arrays.sort(hotel);
        System.out.println(Arrays.binarySearch(hotel,"Andy"));
        System.out.println(Arrays.binarySearch(hotel, "Tom"));
        System.out.println(Arrays.binarySearch(hotel, "Lee"));
        //Lee不存在，则返回负数
	}

}
