package PracticeExample;
/*You can create your own exception class by simply extending Exception and 
 * adding some constructor methods
 * be sure to manually throw the exception in the try block
 * make use of the getMessage() exception method in the catch block
 * 
 * 
 * 
 */
public class ExceptionCustomCheck extends Exception{
	public ExceptionCustomCheck() {
		super();
	}

	public static void main(String[] args) {
		Mailer m=new Mailer();
		m.send();

	}

}
class Mailer {
	public void send() {
		try {
			throw new ExceptionCustomCheck();
		
		}
		catch(ExceptionCustomCheck e) {
			System.out.println("Exception checked:");
			System.out.println(e);
		}
	}
}
