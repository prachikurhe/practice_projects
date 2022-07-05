package MultiThreading;
class MyThread5 extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadPriorityDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 t5=new MyThread5();
		t5.setPriority(10);
		t5.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
