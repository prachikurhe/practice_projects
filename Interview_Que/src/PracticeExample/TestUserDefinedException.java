package PracticeExample;

public class TestUserDefinedException extends RuntimeException {

	public TestUserDefinedException(String message) {
		super(message);
	}

	public TestUserDefinedException() {
		// TODO Auto-generated constructor stub
	}

	public void ageIsValid() {
		throw new TestUserDefinedException("Age is Invalid");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUserDefinedException t = new TestUserDefinedException();
		t.ageIsValid();
	}

}