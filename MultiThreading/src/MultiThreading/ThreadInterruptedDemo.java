package MultiThreading;
class MyThreadt extends Thread{
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
}
public class ThreadInterruptedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadt t1=new MyThreadt();
		t1.start();
		t1.interrupt();
		
		
	  System.out.println("End of main method");
		

	}

}
