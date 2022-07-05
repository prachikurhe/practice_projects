package Java.langPkg;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append("PI value is:");
		sb.append(3.14);
		sb.append("It is exactly:");
		sb.append(true);
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Prachi");
     	sb1.insert(6, 'n');
		System.out.println(sb1);
//		
//		sb1.delete(0, 3);
//		System.out.println(sb1);
//		
//		sb1.deleteCharAt(1);
//		System.out.println(sb1);
//		
		
		System.out.println(sb1.reverse());
		
		sb.setLength(6);
		System.out.println(sb);
		
    	System.out.println(sb.capacity());	
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
	
       
		StringBuffer sb2=new StringBuffer(1000);
		sb2.append("abcd");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
			

	}

}
