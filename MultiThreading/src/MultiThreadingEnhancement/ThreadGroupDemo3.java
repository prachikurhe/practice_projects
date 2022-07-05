package MultiThreadingEnhancement;
class MyThread extends Thread{
	MyThread(ThreadGroup g, String name){
		super(g, name);
	}
	public void run() {
		System.out.println("child thread");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}
	}
}
public class ThreadGroupDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
		MyThread t1=new MyThread(pg,"Child Thread-1");
		MyThread t2=new MyThread(pg,"Child Thread-2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		

	}

}
