package Java.langPkg;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1=new String("prachi");
		String s2=new String("prachi");
		String s3=new String("sachin");
		StringBuffer  sb1=new StringBuffer("prachi");
		StringBuffer  sb2=new StringBuffer("prachi");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
	//	System.out.println(s1==sb1);  -to use == operator compulsory there should be relation between argument type(either child to parent ..
	//	System.out.println(sb1==sb2);
	//	System.out.println(s1.equals(sb2));
		
	//System.out.println(s1);

	}

}
