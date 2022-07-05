package MultiThreading;
class MyThread2 extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class ThreadYeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t=new MyThread2();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		

	}

}
