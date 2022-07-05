package InnerClasses;

public class StaticNestedOuterClass {
	static class Nested{
		public void m1() {
			System.out.println("Static Nested Inner class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested n=new Nested();
		n.m1();

	}

}
