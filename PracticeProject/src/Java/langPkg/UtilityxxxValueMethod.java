package Java.langPkg;

public class UtilityxxxValueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2)xxxValue()-to convert wrapper object to primitive
		Integer I=new Integer(130);
		
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.intValue());
		System.out.println(I.longValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());
		
		Short S=new Short((short) 12);
		System.out.println(S.byteValue());
		
		//charValue()
		Character ch=new Character('P');
		System.out.println(ch.charValue());
		
		//booleanValue()
		Boolean b=new Boolean (true);
		System.out.println(b.booleanValue());

	}

}
