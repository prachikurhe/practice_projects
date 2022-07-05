package PracticeExample;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Seema";
		char c='m';
		int res=0;

		for(int i=0; i<s.length();i++) {
			if(c==s.charAt(i)) {
				res++;
			}
			
		}
		System.out.println(res);

	}

}
