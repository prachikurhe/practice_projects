package PracticeExample;

public class StringSortCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dcba";
		char temp;
		char []arr=s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length();j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(new String(arr));

	}

}
