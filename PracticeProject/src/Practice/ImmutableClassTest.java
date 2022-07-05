package Practice;

/**
 * What is immutable?
 * 
 * answer : immutable means, if we try to modify the states of object then , the
 * new object we will be created. existing object will not be modified. in java
 * all wrapper classes and String class are immutable.
 * 
 * in below example:
 * 
 * String name = "sachin" ===> 1 name = name+"nagwade" ===>2
 * 
 * in above line 1 the with sachin will be created, and line 2 we concated
 * `sachin` with `nagwade`, where new object with `sachin nagwade` will be
 * created , and existing `sachin` will not be modified.
 * 
 * in below example we are creating our Own immutableClass.
 * 
 * @author win10
 */

public class ImmutableClassTest {
	public static void main(String[] args) {
			
		Immutable1 m1 = new Immutable1("Prachi", 101);
		Immutable1 m2 = m1.setName("Sachin");
		
		
		System.out.println(m1.equals(m2));
		
		System.out.println(m1);
		System.out.println(m2);
		
	}

}

//class should final , so no one can extend the class
final class Immutable {

	private String name;
	private int age;
	
	public Immutable(String name, int age) {
		super();
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
		return "Immutable [name=" + name + ", age=" + age + "]";
	}	

}

//class should final , so no one can extend the class
final class Immutable1 implements Cloneable{

	private String name;
	private int age;
	
	public Immutable1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}


	
	public Immutable1 setName(String name) {
		try 
		{
			Immutable1 clone = (Immutable1) this.clone();
			clone.name = name;
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	
	}
	public Immutable1 setAge(int age) {
		try 
		{
			Immutable1 clone = (Immutable1) this.clone();
			clone.age = age;
			return clone;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	
	@Override
	public String toString() {
		return "Immutable [name=" + name + ", age=" + age + "]";
	}	

}