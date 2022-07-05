/*package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal1{
	int i=10;
	Animal1(){
		System.out.println("Animal Constructor Called");
	}
}
class Dog extends Animal1 implements Serializable{
	int j=20;
	Dog(){
		System.out.println("Dog constructor called");
	}
	
}
public class InheritanceDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.i=888;
		d1.j=999;
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println(d1.i+" "+d1.j);
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+" "+d2.j);

	}

}*/
