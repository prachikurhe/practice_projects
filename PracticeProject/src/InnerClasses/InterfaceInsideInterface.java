package InnerClasses;

interface Outeris{
	public void m1();
		interface Inner{
			public void m2();
			
		}
	}
class Testr implements Outeris{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Outer interface method implementation");
	}
	
}
class Test2 implements Outeris.Inner{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Inner interface method implementation");
		
	}
	
}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testr t1=new Testr();
		t1.m1();
		Test2 t2=new Test2();
		t2.m2();

	}

}
