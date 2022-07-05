package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int i = 10;

}

class Dog1 extends Animal {
	int j = 20;
}

public class InheritanceDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dog1 d = new Dog1();
		FileOutputStream fos = new FileOutputStream("xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		FileInputStream fis = new FileInputStream("xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d3 = (Dog1) ois.readObject();
		System.out.println(d3.i + "  " + d3.j);

	}

}
