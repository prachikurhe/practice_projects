package MultiThreading;
class MyThread3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++);
		 {
		System.out.println("Child Thraed");
		try {
		Thread.sleep(2000);
	        }
		catch(InterruptedException e){
			System.out.println("a");
		    }
       }
}
}
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread3 t=new MyThread3();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		

	}
}


