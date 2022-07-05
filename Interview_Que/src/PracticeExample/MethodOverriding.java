package PracticeExample;
/*If subclass (child class) has the same method as declared in the parent class, 
 * it is known as method overriding in Java.
 * 
Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).

 */

class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is running safely");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Bike2();  
		v.run();
		
		  Bike2 obj = new Bike2();//creating object  
		  obj.run();//calling method  


	}

}
