package Java.langPkg;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Prachi";
		System.out.println(s.charAt(4));//public char charAt()
		System.out.println(s.equals("Prachi"));
		System.out.println(s.equals("PRACHI"));
		System.out.println(s.equalsIgnoreCase("PRACHI"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(2, 4));
		System.out.println(s.length()); 
		System.out.println(s.replace('r','a'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());

	}

}
		
