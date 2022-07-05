
package PracticeExample;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,5,4,6,8,7};
		
		System.out.println();
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			System.out.println(a[i]);
		}

	}

}
