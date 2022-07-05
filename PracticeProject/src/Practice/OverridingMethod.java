package Practice;


class Test1 {
	public void property() {
		System.out.println("cash");
	}
	public void marry() {
		System.out.println("SubhLaxmi");
	}
}

public class OverridingMethod extends Test1{
	
	public void marry() {
		System.out.println("Trisha");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.marry();
		t.property();
		
		OverridingMethod o=new OverridingMethod();
		o.marry();
		o.property();
		
   	}

}