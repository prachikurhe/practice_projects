package MultiThreading;
class MyThreadSet extends Thread{
	
}
public class GetAndSetName2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread t=new Thread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Prachi");
		System.out.println(Thread.currentThread().getName());
		t.setName("First Thread");
		System.out.println(t.getName());

	}

}
