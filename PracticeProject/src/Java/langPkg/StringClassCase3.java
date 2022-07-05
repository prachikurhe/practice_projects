package Java.langPkg;

public class StringClassCase3 {

	public static void main(String[] args) {
//		String s="swati";
//		String s1="sonali";
//
//		//System.out.println(s.equals(s1));
//		System.out.println(s==s1);
		String s1=new String("Durga");
		s1.concat("software");
		String s2=new String("soluions");
		s2=s2.concat(s1);
		s1=s1.concat("soft");
		System.out.println(s1);
		System.out.println(s2);
		
			

	}

}
