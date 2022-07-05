package Java.langPkg;

import java.util.concurrent.TimeUnit;

public class FinalizeDemo {
	public static void main(String[] args) {

		StudentData data = new StudentData();//
		data= null;
		System.gc();
		System.out.println("End program");
		
	}

}

class StudentData {
	String name;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");
	}
}