package PracticeExample;

public class ImmutablePractice {

	public static void main(String[] args) throws CloneNotSupportedException {
		Immutable i=new Immutable("Prachi", 24);
        System.out.println(i.getName()+" "+i.getAge());
        Immutable i1=i.setName("Sachin");
        System.out.println(i);
        System.out.println(i1);
	}

}

final class Immutable implements Cloneable {
	private String name;
	private final int age;

	public Immutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public Immutable setName(String name) throws CloneNotSupportedException {
		Immutable i1=(Immutable)this.clone();
		i1.name=name;
		return i1;
		
		
		}

	@Override
	public String toString() {
		return "Immutable [name=" + name + ", age=" + age + "]";
	}
	
}
