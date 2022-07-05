package InnerClasses;

class Test{
	public void m1() {
	class Inner{
		public void sum(int x,int y) {
			System.out.println("sum:"+(x+y));
		}
	}
	Inner i=new Inner();
	i.sum(10, 20);
	i.sum(100,200);
	i.sum(1000, 2000);
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test ();
		t.m1();

	}

}
