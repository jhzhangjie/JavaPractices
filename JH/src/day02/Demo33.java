package day02;

import java.util.Timer;
import java.util.TimerTask;

public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final Timer timer=new Timer();
        //使用匿名内部类实现TimerTask
        TimerTask task=new TimerTask(){
        	public void run(){
        		System.out.println("HI");
        	}
        };
        timer.schedule(task, 0,1000);
        timer.schedule(new TimerTask(){
        	public void run(){
        		timer.cancel();//在匿名内部类中只能访问final局部变量
        	}
        },1000*10);
	}	
}


