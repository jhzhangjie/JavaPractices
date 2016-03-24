package day01;
/**
 * 数组的“迭代”，即重复处理或者遍历。
 * 数组的迭代：逐一处理数组的每个元素
 * 
 *统计分数操作：
 *假设一个学生的分数：
 *       数学   语文     英语  自然
 *score={65.5,75.5,88,93}
 */
public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] score={65.5,75.5,88,93};
        double sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        	
        }
        System.out.println("平均分："+sum/score.length);
	}

}
