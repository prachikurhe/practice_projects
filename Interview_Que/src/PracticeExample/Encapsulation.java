package PracticeExample;


class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Prachi");
		p.setAge(23);
		System.out.println(p.getName()+" , "+p.getAge());
		
	}

}
