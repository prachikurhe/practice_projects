package MultiThreading;
class MyThreadD extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
public class DaemonThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		
		MyThreadD t=new MyThreadD();
		//System.out.println(t.isDaemon());
		t.setDaemon(true);
		//System.out.println(t.isDaemon());
		t.start();
		System.out.println("End of main thread");
		
		

	}

}
