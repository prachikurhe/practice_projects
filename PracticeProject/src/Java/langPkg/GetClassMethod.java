package Java.langPkg;

import java.lang.reflect.Method;

public class GetClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Object o=new String("durga");
		Class c=o.getClass();
		System.out.println("The fully qualified name of the class:"+c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Method Information:");
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("");
		

	}

}
