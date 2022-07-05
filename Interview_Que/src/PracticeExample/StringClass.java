package PracticeExample;

/**
 * What is immutable?
 * 
 * answer : immutable means, if we try to modify the states of object then , the
 * new object we will be created. existing object will not be modified. in java
 * all wrapper classes and String class are immutable.
 * immutable means that the object's actual value can't be changed,
 *  but you can change its reference to another one.
 * in below example:
 * String name = "sachin" ===> 1 name = name+"nagwade" ===>2
 * in above line 1 the with sachin will be created, and line 2 we concated
 * `sachin` with `nagwade`, where new object with `sachin nagwade` will be
 * created , and existing `sachin` will not be modified.
 * 
 * in below example we are creating our Own immutableClass.
 * */

public class StringClass {

	public static void main(String[] args) {

		Immutable2 i = new Immutable2("Prachi", 23);
		System.out.println(i.getName() + i.getAge());
		System.out.println(i);
	}
}

final class Immutable2 {
	private final String name;
	private final int age;

	public Immutable2(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;

	}

	@Override
	public String toString() {
		return "Immutable2 [name=" + name + ", age=" + age + "]";

	}

}
