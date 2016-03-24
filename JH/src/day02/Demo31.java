package day02;

import java.util.Timer;
import java.util.TimerTask;
/**
 * 内部类，在类内部定义的类
 * 内部类主要用于封装一个类的声明在类的内部，减少内的暴露。
 * 
 *
 */
public class Demo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Xoo4 xoo=new Xoo4();
        xoo.start();
	}

}
class Xoo4{
	Timer timer=new Timer();
	public void start(){
		timer.schedule(new MyTask(),0,1000);
		timer.schedule(new StopTask(), 1000*10);
	}
	private class StopTask extends TimerTask{//内部类和平常类一样，不过内部类被藏起来了。
		public void run(){
			timer.cancel();//取消timer上的任务
		}
	}
	private class MyTask extends TimerTask{
		int i=10;
		public void run(){
			System.out.println(i--);
		}
	}
}