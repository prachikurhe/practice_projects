

package PracticeExample;

abstract class Bike{
	int id;
	String name;
	Bike(int id,String name){
		this.id=id;
		this.name=name;
		
		System.out.println("Bike is created...");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear changed...");
	}
}
class Honda extends Bike{

	Honda(int id, String name) {
		
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println("running safely...");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
       Bike b=new Honda(101,"Bajaj Pulsor");
       System.out.println(b.id+" "+b.name);
       b.run();
       b.changeGear();
       
		
	}

}
