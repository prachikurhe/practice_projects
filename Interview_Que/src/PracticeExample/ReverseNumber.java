package PracticeExample;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 125;
		int temp, reminder = 0, reverse = 0;
		temp = num;
		while (num != 0) {
			reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;

		}

		System.out.println("Reverse of this number is :" + reverse);

	}

}
