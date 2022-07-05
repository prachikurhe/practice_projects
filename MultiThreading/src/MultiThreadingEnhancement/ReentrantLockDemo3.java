package MultiThreadingEnhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThraed extends Thread {
	static ReentrantLock l = new ReentrantLock();

	MyThraed(String name){
		super(name);
	}

	public void run() {
		do {
			try {
				if (l.tryLock(5000, TimeUnit.MILLISECONDS))//tryLock with timeperiod
				{
					System.out.println(Thread.currentThread().getName() + "...got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + "...releases lock");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "...unable to get lock and will try again");
				}

			} catch (Exception e) {
			}

		} while (true);

	}

}

public class ReentrantLockDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThraed t1=new MyThraed("First Thread");
		MyThraed t2=new MyThraed("Second Thread");
		t1.start();
		t2.start();

	}

}
