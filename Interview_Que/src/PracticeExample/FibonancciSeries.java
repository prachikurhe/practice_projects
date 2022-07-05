package PracticeExample;

public class FibonancciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    int firstTerm = 0, secondTerm = 1;
//
//	    for (int i = 1; i <= 10; ++i) {
//	      System.out.print(firstTerm + ", ");
//
//	      // compute the next term
//	      int nextTerm = firstTerm + secondTerm;
//	      firstTerm = secondTerm;
//	      secondTerm = nextTerm;
		
		int  num1=0, num2=1;
		int temp;
		for(int i=0; i<=10; i++) {
			System.out.print(num1+",");
			
			temp=num1+num2;
			num1=num2;
			num2=temp;
			
//			temp=num1;
//			num1=num2;
//			num2=num1+temp;
			
	    }

	}

}
