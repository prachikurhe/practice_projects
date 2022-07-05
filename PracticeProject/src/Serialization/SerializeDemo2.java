package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*class Dog implements Serializable{
	int i=20;
}
class Cat implements Serializable{
	int i=30;
}
class Rat implements Serializable{
	int i=40;
	
}

public class SerializeDemo2 {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		Cat c1=new Cat();
		Rat r1=new Rat();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o instanceof Dog) {
			Dog d2=(Dog)o;
		}
		else if(o instanceof Cat){
			Cat c2=(Cat)o;
		}
		else if(o instanceof Rat) {
			Rat r2=(Rat)o;
		}

		}
	

}*/

















