package MultiThreading;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("slide_"+i);
			Thread.sleep(5000);
		}

	}

}
