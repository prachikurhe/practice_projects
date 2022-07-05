package FileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDuplicates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		String line1=br1.readLine();
		while(line1!=null) {
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("File3.txt"));
			String line2=br2.readLine();
			while(line2!=null) {
				if(line1.equals (line2)) {
					available =true;
					break;
				}
				line2=br2.readLine();
			}
			if(available==false) {
				pw.println(line1);
				pw.flush();
			}
			line1=br1.readLine();
			
		}
				
			}
			
			
		
		

	

}
