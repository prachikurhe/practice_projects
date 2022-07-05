package InnerClasses;
//Anonymous inner class that implements an interface
public class AnonymousInnerClassThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable()
		{
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println("child thread");
			}
		}

	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("main thread");
	}

}
}
