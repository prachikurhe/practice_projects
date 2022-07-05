package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	/*
	 * int i=10; int j=20;
	 */

	transient int i = 10;
	transient int j = 20;

	// transient static int i=10;
	// int j=20;

	// transient final int i=10;
	// final int j=20;
}

class Cat implements Serializable {
	int i = 30;
}

class Rat implements Serializable {
	int i = 40;

}

public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		Cat c2 = (Cat) ois.readObject();
		Rat r2 = (Rat) ois.readObject();
		System.out.println(d2.i + "    " + d2.j);
		System.out.println(c2.i);
		System.out.println(r2.i);

	}

}
