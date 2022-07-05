package InnerClasses;
//calling current class member-use of this
public class Outer3 {
	int x=10;
	//static int y=20;
	class Inner{
		int x=40;
		
public void m1() {
	int x=12;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(Outer3.this.x);
	//System.out.println(y);
}
	}
	
public static void main(String[] args) {
	//new Outer3 ().new Inner().m1();
	Outer3 o=new Outer3();
	Outer3.Inner i=o.new Inner();
	i.m1();
}

	}


