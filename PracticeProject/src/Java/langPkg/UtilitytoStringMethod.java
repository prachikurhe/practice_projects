package Java.langPkg;

public class UtilitytoStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//form1-public String toString()
		Integer I=new Integer(10);
		String s=I.toString();
		System.out.println(s);
		System.out.println(I);
		
		//form2-toString(primitive)
		String S=Integer.toString(100);
		String S1=Boolean.toString(false);
		System.out.println(S);
		System.out.println(S1);
		
		//form3-toString(primitive, int radix)
		String S2=Integer.toString(15, 2);
		System.out.println(S2);
		

	}

}
