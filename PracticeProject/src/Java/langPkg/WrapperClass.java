package Java.langPkg;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructors
		Integer i=new Integer(10);
		Integer i1=new Integer("10");
		System.out.println(i);
		System.out.println(i1);
		
		Double d=new Double(10.5);
		Double d1=new Double("10.5");
		System.out.println(d);
		
		Float f=new Float(10.5f);
		Float f1=new Float("10.5f");
		Float f2=new Float(10.5);
		System.out.print(f+" "+f1+" "+f2);
		
		System.out.println();
		Character ch= new Character('c');
		System.out.print(ch);
		
		System.out.println();
		Boolean B=new Boolean(true);
		Boolean b=new Boolean(false);
//		Boolean B1=new Boolean(True);
//		Boolean b1=new Boolean(prachi);
		System.out.println(B+" " +b);
		Boolean B2=new Boolean("true");
		Boolean b2=new Boolean("false");
		Boolean b3=new Boolean("prachi");
		System.out.println(B2+" " +b2+" " +b3);



	}

}
