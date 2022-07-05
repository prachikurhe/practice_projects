package InnerClasses;

abstract class Person{
	abstract void eat();
}

class AnonymousInnerClassEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person(){
			public void eat() {
				System.out.println("Nice friuts");
			}
		};
			p.eat();
		}
			
		}
		

	
