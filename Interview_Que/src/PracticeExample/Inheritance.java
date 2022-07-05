package PracticeExample;
/*What is the inheritance in Java?
Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
 The new class that is created is known as subclass (child or derived class) and the existing class from 
 where the child class is derived is known as superclass (parent or base class).

 * 
 */

class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two t=new two();
		t.print_for();
		t.print_geek();

	}

}
