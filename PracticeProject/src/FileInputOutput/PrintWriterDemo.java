package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("prachi123");
		PrintWriter pw=new PrintWriter(fw);
		pw.write("A");
		pw.write(100);
		pw.println(10);
		pw.println('M');
		pw.write('S');
		pw.flush();
		pw.close();
		

	}

}
