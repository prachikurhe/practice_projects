package Java.langPkg;
//Autoboxing Vs Widening
public class AutoboxingCase1 {
	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}
	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void main(String[] args) {
		// 
		int x=10;
		m1(x);

	}

}
