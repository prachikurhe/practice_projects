package MapInterface;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//File f1=new File("db.properties");
		//f1.createNewFile();
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("db.properties");
		
		p.load(fis);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		
		
		

	}

}
