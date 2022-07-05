package Practice;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Even Numbers:");
		for(int i=0; i<=100; i++) {
		
			if(i%2==0) {
				System.out.print( i+" ");
				sum=sum+i;
				
			}
						
		}
		System.out.print("\n"+"sum of even number:"+sum);

	}

}
