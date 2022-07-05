package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileIOExample1 {

	public static void main(String[] args) throws Exception {
		/*File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		*/
		
		File f1=new File("Prachi111");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		


	}

}
