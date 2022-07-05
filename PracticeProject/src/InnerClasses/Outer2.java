package InnerClasses;
//Accessing Inner class code from instance area of outer class

public class Outer2 {
class Inner{
	public void m1() {
		System.out.println("Inner class code");
	}
}
public void m2() {
	Inner i=new Inner();
	i.m1();
}
public static void main(String[] args) {
	Outer2 o=new Outer2();
    o.m2(); 
}
}
