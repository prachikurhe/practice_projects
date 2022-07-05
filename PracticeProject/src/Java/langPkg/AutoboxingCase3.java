package Java.langPkg;
//Autoboxing Vs Var-arg method
public class AutoboxingCase3 {
	/*
	public static void m1(int...x) {
		System.out.println("var-arg method");
	}
	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		m1(10);

	}
	*/

	public static void m1(Long l) {
		System.out.println("long");
	}
	public static void main(String[] args) {
		long x=10;
		m1(x);
	}
}
