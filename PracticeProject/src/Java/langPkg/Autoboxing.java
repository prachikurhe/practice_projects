package Java.langPkg;



public class Autoboxing {
	static Integer I=10;     //Autoboxing

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=I;            //Autounboxing
		m1(i);              //Autoboxing

	}
	public static void m1(Integer K) {
		int m=K;             //Autounboxing
		System.out.println(m);
	}

}
