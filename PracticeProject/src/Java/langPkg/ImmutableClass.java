package Java.langPkg;//compulsory immutable class declared  as final

final public class ImmutableClass {
	private int i;
	ImmutableClass(int i){
		this.i=i;
		
	}
	public ImmutableClass modify(int i) {
		if(this.i==i) {
			
		return this;
		
	}
		else {
			return(new ImmutableClass(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass c=new ImmutableClass(10);
		ImmutableClass c1=c.modify(100);
		ImmutableClass c2=c.modify(10);
		System.out.println(c==c1);
		System.out.println(c==c2);

	}

}
