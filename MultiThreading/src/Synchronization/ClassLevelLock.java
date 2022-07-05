package Synchronization;
class Display1{
	public static synchronized void displayn() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
	}
	public static synchronized void displayc() {
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
class MyThread3 extends Thread{
	Display1 d1;
	MyThread3(Display1 d1){
		this.d1=d1;
		
	}
	public void run() {
		d1.displayn();
	}
}
class MyThread4 extends Thread{
	Display1 d1; 
	MyThread4(Display1 d1){
		this.d1=d1;
	}
	public void run() {
		d1.displayc();
	}
}
public class ClassLevelLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d1=new Display1();
		MyThread3 t3=new MyThread3(d1);
		MyThread4 t4=new MyThread4(d1);
		t3.start();
		t4.start();
		
		

	}

}
