package Practice;

public class OverloadingExample {
	public void m1(String s) {
		System.out.println("String Version");
	}
	public void m1(Object o) {
		System.out.println("Object Version");
	}
	public static void main(String[] args) {
		OverloadingExample t=new OverloadingExample();
	  
		t.m1("Prachi");
		t.m1(null);
		t.m1(new Object());
	}

}
