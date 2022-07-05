package InnerClasses;
class Test1{
	int a=10;
	static int b=20;
	//public static void m1() {
	public void  m1() {
		class Inner{
			public void m2() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
}
public class MethodLocalInnerClass1 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
	}

}
