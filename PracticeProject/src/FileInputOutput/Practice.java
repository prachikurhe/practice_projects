package FileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*int count=0;
		File f1=new File("aaa.txt");
		//f1.createNewFile();
		f1.mkdir();
		File f=new File("C:\\durga_classes");
		File f6=new File("C:\\durga_classes","Nagode111");
		f6.mkdir();
		String []s=f.list();
		for(String s1:s) {
			File f8=new File(f,s1);
			if(f8.isDirectory()) {
			count++;
			System.out.println(s1);
			}
		}
		System.out.println(count);
		*/
		PrintWriter pw=new PrintWriter("prachi123");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		String line1=br1.readLine();
		while(line1 !=null) {
			pw.write(line1);
			line1=br1.readLine();
		}
		br1=new BufferedReader(new FileReader("File2.txt"));
	    line1=br1.readLine();
		while(line1!=null) {
			pw.println(line1);
			line1=br1.readLine();
			
		}
	

	pw.flush();
	br1.close();
	
	pw.close();
		
		}

}
