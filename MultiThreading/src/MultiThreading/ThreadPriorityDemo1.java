package MultiThreading;
class MyThread8 extends Thread{
	
}
public class ThreadPriorityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		//Thread.currentThread().setPriority(7);
		MyThread8 t=new MyThread8();
		System.out.println(t.getPriority());

	}

}
