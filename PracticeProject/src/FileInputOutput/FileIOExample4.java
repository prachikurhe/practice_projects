package FileInputOutput;

import java.io.File;

//write a program to display only name of all directories present in C:\\durga_classes
public class FileIOExample4 {

	public static void main(String[] args) {
		int count =0;
		File f=new File("C:\\durga_classes");
		String []s=f.list();
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
			
			}
		System.out.println("The total number:"+count);


	}

}
