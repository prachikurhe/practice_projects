package Cumulus_System;

/**
 * Singleton class means , the have only one instance. we restricting class from
 * getting created multiple object.
 * 
 * 1) making constructor private , so no one can create instance outside the
 * class. 2) providing factory or static method to create object. 3) creating
 * private static variable to store created object.
 * 
 * @author win10
 *
 */

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=Animal.getInstance();
		Animal animal1=Animal.getInstance();
		System.out.println(animal.toString());
		System.out.println(animal1.toString());

	}
	

}
class Animal{
	private static Animal single_instance;
	
	private Animal() {
		
	}
	public static Animal getInstance() {
		if(single_instance==null) {
			single_instance=new Animal();
			
		}
		
		return single_instance;
		
	}
}

