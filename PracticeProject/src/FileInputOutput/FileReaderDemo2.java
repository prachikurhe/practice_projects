package FileInputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("prachi123");
		char []ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch) {
			System.out.println(ch1);
		
		}
		
	
		

	}

}
