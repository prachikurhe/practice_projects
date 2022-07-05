package MultiThreadingEnhancement;
//Constructors
public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup g1=new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		ThreadGroup g2=new ThreadGroup(g1,"second group");
		System.out.println(g2.getParent().getName());
		

	}

}
