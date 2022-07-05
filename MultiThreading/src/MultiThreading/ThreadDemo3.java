package MultiThreading;
class MyThread1 extends Thread{
	public void run() {
		System.out.println("CHILD THREAD");
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();
		Thread t2=new Thread(t1);
		t2.start();
		System.out.println("Main Thread");
		

	}

}
