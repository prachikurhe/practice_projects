package InnerClasses;

public class StaticNestedClass {
	static int a=10;
	static class Inner{
		//static void msg() {
		void msg() {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticNestedClass.Inner.msg();
		Inner i=new Inner();
		i.msg();
		
	}

}
