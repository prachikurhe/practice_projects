package MultiThreadingEnhancement;
//Methods
public class ThreadGroupDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup g=new ThreadGroup("Thread Group");
		Thread t1=new Thread(g,"Thread-1");
		Thread t2=new Thread(g,"Thread-2");
		g.setMaxPriority(3);
		Thread t3=new Thread(g,"Thread-3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

	}

}
