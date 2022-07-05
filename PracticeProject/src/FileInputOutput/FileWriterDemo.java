package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args)throws IOException {
		// FileWriter fw=new FileWriter("prachi123");
		FileWriter fw=new FileWriter("File1.txt",true);
		
		fw.write(100);
		fw.write("urga\nsoftwareSolutions");
		fw.write('\n');
		char[]ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.write("classes");
		fw.flush();
		fw.close();
		
		
		
		


	}

}
