package Java.langPkg;

public class UtilityvalueOfMethod {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)valueOf()-to convert  primitive / String into wrapper object
		//form-1 wrapper valueOf(String s)
		Integer I =Integer.valueOf("10");
		Double D=Double.valueOf("10.5");
		Boolean b=Boolean.valueOf("durga");
		System.out.println(I+" "+D+" "+b);
		
		//Form-2 wrapper valueOf(String s, int radix)
		Integer I1=Integer.valueOf("10", 2);
		System.out.println(I1);
		Integer I2=Integer.valueOf("1111",4);
		System.out.println(I2);
		
		//FORM-3 WRAPPER valueOf(primitive)
		Integer I3=Integer.valueOf(10);
		Character ch=Character.valueOf('a');
		System.out.println(I3+" "+ch);
		

	}

}
