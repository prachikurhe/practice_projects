package PracticeExample;

public class Java {
	public static void main(String[] args) {
		sum(new int[] {1,2,3});
	}
	
	public static void sum(int[]a) {
		int total=0;
		for(int i:a) {
			total=total+i;
			System.out.println(total);
		}
	}

}