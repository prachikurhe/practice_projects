package PracticeExample;

public class ExceptionCustomUncheck extends RuntimeException {
	public ExceptionCustomUncheck(String s) {
		super(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mailer1 m1=new Mailer1();
		m1.send();
		

	}

}
class Mailer1{
	public void send() {
		throw new ExceptionCustomUncheck("Exception Checked:");
	}
}
