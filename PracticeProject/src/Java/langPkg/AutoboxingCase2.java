package Java.langPkg;
//Widening VS Var-arg Methods
public class AutoboxingCase2 {
	public static void m1(int...x) {
		System.out.println("var-arg method");
	}
	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		m1(x);
		

	}

}
