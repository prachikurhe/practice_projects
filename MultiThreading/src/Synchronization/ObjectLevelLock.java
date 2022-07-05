package Synchronization;
class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning:");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println(name);
	}
}
}
	
class MyThread1 extends Thread{
	Display d;
	String name;
	 MyThread1(Display d,String name){
		this.d=d;
		this.name=name;
	}
	 public void run() {
		 d.wish(name);
	 }
}
public class ObjectLevelLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		MyThread1 t1=new MyThread1(d,"Dhoni");
		MyThread1 t2=new MyThread1(d,"Raina");
		t1.start();
		t2.start();

	}

}
