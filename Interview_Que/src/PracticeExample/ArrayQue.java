package PracticeExample;

import java.util.Arrays;

/*
 * Given a sorted array A containing N integers both positive and negative.
//You need to create another array containing the squares of all the elements in A and //return it in non-decreasing order.

 */
public class ArrayQue {

	public static void main(String[] args) {
		int arr[]= {-4,-6,1,2,4};
		int square[]=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			square[i]=arr[i]*arr[i];
			
		}
		Arrays.sort(square);
		for(int i=0; i<arr.length; i++) {
			System.out.print("\t"+square[i]);
		}
		

	}

}
