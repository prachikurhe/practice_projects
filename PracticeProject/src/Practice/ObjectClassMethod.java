package Practice;

import java.util.Objects;

class Student {
	int sid;
	String name, city;

	public Student() {
		System.out.println("Default constructor");
	}

	Student(int sid, String name, String city) {
		this.sid = sid;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return "sid:" + sid + " name: " + name + " city: " + city;

	}

	@Override
	public int hashCode() {
		return Objects.hash(city, name, sid);
	}

	
	public boolean equals(Object o) {
		Student s1 = (Student) o;
		return (this.sid == s1.sid && this.name.equals(s1.name) && this.city.equals(s1.city));

	}

}

public class ObjectClassMethod {

	public static void main(String[] args) {
		Student s1 = new Student(101, "prachi", "pune");
		Student s2 = new Student(102, "nikki", "nagar");
		Student s3 = new Student(103, "pratiksha", "newasa");
		Student s4 = new Student(101, "prachi", "pune");
		// System.out.println(s1);// some info about class
		 System.out.println(s1.toString());
		// System.out.println(s2);
		// System.out.println(s1.hashCode());//numeric value
		 System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
