package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	int i=10;
	Animal(){
		System.out.println("animal constructor called");
	}
}
class Dog extends Animal implements Serializable{
	int j=20;
	Dog(){
		System.out.println("dog constructor called");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) throws Exception {

		Dog d1=new Dog();
		d1.i=888;
		d1.j=999;
		 
		FileOutputStream fos=new FileOutputStream("xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
	
		 System.out.println("Deserialisation started");
		FileInputStream fis=new FileInputStream("xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+"  "+d2.j);

	}

}
