package MultiThreading;
class MyThreadGet extends Thread{
	public void run() {
		System.out.println("run method executed by thread:"+Thread.currentThread().getName());
	}
}
public class GetAndSetName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadGet t=new MyThreadGet();
		t.start();
		System.out.println("main method executed by thread:"+Thread.currentThread().getName());

	}

}
