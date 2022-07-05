package InnerClasses;
//Anonymous Inner class that defined inside argument
public class AnonymousInnerClassThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable()
		{
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println("child thread");
			}
		}
			

	}).start();
	//Thread t=new Thread(r);
	//t.start();
	for(int i=0;i<10;i++) {
		System.out.println("main thread");
	}





	}

}
