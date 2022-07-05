package PracticeExample;
/*
 * When there is a chain of inheritance, it is known as multilevel inheritance.
 */

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b=new BabyDog();
		b.eat();
		b.bark();
		b.weep();

	}

}
