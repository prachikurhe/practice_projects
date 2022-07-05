package PracticeExample;

public class PalindromeNumber {
	
	public static void main(String[] args) {
        int number = 525;
        int temp, palindrome = 0, reminder = 0;
        temp = number;
        while (number > 0) {
            reminder = number % 10;
            palindrome = (palindrome * 10) + reminder;
            number = number / 10;

        }
        if (palindrome==temp){
            System.out.println("This number is palindrome");
        }
        else{
            System.out.println("This number is not palindrome");
        }

    }

}
