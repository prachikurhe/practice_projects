package PracticeExample;
class Dog2{
	String dogName="Tommy";
}
public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog=null;
		try {
			System.out.println(dog.dogName);
		}
		catch(NullPointerException e) {
			 dog=new Dog2();
			System.out.println(dog.dogName);
		}

	}

}
