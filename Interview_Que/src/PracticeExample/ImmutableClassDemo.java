package PracticeExample;

public class ImmutableClassDemo {

	public static void main(String[] args) {
		
		ImmutableTest t1=new ImmutableTest(10);
		ImmutableTest t2=t1.modifyImmutableTest(100);
		ImmutableTest t3=t1.modifyImmutableTest(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);

	}

}
final class ImmutableTest{
	private int i;
	public ImmutableTest(int i) {
		this.i=i;
	}
	public ImmutableTest modifyImmutableTest(int i) {
		if(this.i==i) {
			return this;
		}
		else {
		return (new ImmutableTest(i));
		
	}
	
}
}