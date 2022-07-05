package Java.langPkg;

public class UtilityparsexxxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3)parsexxx()-to convert string to primitive value
		
		//form1-primitive parseXxx(String)
		int i=Integer.parseInt("100");
		System.out.println(i);
		 double d=Double.parseDouble("122");
		 System.out.println(d);
		
		//form2-parseXxx(String s, int radix)
		int i1=Integer.parseInt("1111",2);
		System.out.println(i1);
		
		

	}

}
