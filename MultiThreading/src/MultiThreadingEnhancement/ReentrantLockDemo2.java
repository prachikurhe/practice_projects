package MultiThreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadr extends Thread{
	static ReentrantLock r=new ReentrantLock();
	MyThreadr(String name){
		super(name);
	}
	public void run() {
		if(r.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"..got lock & performing safe operations");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			r.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+"..unable to get lock & performing alternative operations");
		}
	}
}
public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadr t1=new MyThreadr("First Thread");
		MyThreadr t2=new MyThreadr("Second Thread");
		t1.start();
		t2.start();

	}

}
