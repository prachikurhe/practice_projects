package Synchronization;
class Display2{
	public void wish(String name) {
		;;;;;;//1 lack lines of code
		synchronized(this) {
			for(int i=0; i<10; i++) {
				System.out.println("Good Morning");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
			;;;;;;;;;
		
	}
}
class MyThread extends Thread{
	Display2 d;
	String name;
	 MyThread(Display2 d,String name){
		this.d=d;
		this.name=name;
	}
	 public void run() {
		 d.wish(name);
	 }
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display2 d=new Display2();
		MyThread t1=new MyThread(d,"Dhoni");
		MyThread t2=new MyThread(d,"Raina");
		t1.start();
		t2.start();

	}

}
