package InnerClasses;
//Accessing Inner class code from static area of outer class
//Accessing Inner class code from outside of outer class
public class Outer1 {
	class Inner1{
		public void m1() {
			System.out.println("Inner class method");
		}
	}
	public static void main(String[] args) {
		Outer1 o=new Outer1();
		Outer1.Inner1 i=o.new Inner1();
		i.m1();
		//or
		new Outer1().new Inner1().m1();
	}

}
