package FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("File2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(98);
		bw.newLine();
		char[] ch1= {'a','b','c'};
		bw.write(ch1);
		bw.newLine();
		bw.flush();
		bw.close();
		

	}

}
