package PracticeExample;

import java.lang.reflect.Array;
import java.util.Arrays;
/*
 * Given a sorted array A containing N integers both positive and negative.
You need to create another array containing the squares of all the elements
 in A and return it in non-decreasing order.

 */
public class SquereExample {

	public static void main(String[] args) {

		int arr[] = { 1, 4, -3, -6, 9 };
		int[] squre = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			squre[i] = arr[i] * arr[i];
		}

		Arrays.sort(squre);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t " + squre[i]);
		}

	}
}
	