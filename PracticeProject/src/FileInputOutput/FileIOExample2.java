package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileIOExample2 {

	public static void main(String[] args) throws Exception {
	/*	File f=new File("prachi123");
		f.mkdir();
	//  File f1=new File("prachi123","abc.txt");
		File f1=new File(f,"abc.txt");
		f1.createNewFile();
		
	*/
		//write a program to display name of all files and directory present in C:\\durga_classes
		int count =0;
		File f=new File("C:\\durga_classes");
		File f1=new File("C:\\durga_classes","Prachi123");
		f1.createNewFile();
		
		File f2=new File("C:\\durga_classes","Sachin111");
		f2.mkdir();
		
		String []s=f.list();
		for(String s1:s) {
			count++;
			System.out.println(s1);
		}
		System.out.println("The total number:"+count);


	}

}
