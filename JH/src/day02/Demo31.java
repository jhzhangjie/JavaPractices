package day02;

import java.util.Timer;
import java.util.TimerTask;
/**
 * �ڲ��࣬�����ڲ��������
 * �ڲ�����Ҫ���ڷ�װһ���������������ڲ��������ڵı�¶��
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
	private class StopTask extends TimerTask{//�ڲ����ƽ����һ���������ڲ��౻�������ˡ�
		public void run(){
			timer.cancel();//ȡ��timer�ϵ�����
		}
	}
	private class MyTask extends TimerTask{
		int i=10;
		public void run(){
			System.out.println(i--);
		}
	}
}