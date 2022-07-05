package PracticeExample;

import java.util.Scanner;

public class ArrayInAsecnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int i;
//		int []a= {1,8,9,4,3,5,2};
		
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		
		System.out.println("Enter the elements");
		for(i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		

		}
		
		
		System.out.println("Elements in arrays are:");
		for(i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		for(i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Elements in asecnding order:");
		for(i=0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}

	}

}
