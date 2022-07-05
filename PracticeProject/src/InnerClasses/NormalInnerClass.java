package InnerClasses;

public class NormalInnerClass {
	private int x=10;
	class Inner{
		void message() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalInnerClass o=new NormalInnerClass();
		NormalInnerClass.Inner i=o.new Inner();
		i.message();

	}

}
