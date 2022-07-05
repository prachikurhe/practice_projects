package Java.langPkg;

import java.util.Objects;

class Student1 {
	String name;
	int rollno;

	Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // obj instanceOf Student1
			return false;
		Student1 other = (Student1) obj;
		return this.name.equals(other.name) && this.rollno == other.rollno;// Objects.equals(name, other.name) && rollno
																			// == other.rollno;
	}

	/*
	 * public boolean equals(Object obj) { if( obj instanceof Student1) { Student1
	 * target=(Student1)obj; if(this.name.equals(target.name) &&
	 * this.rollno==target.rollno) { return true; } else { return false; } } return
	 * false;
	 * 
	 * }
	 */

}

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1("Durga", 101);
		Student1 s2 = new Student1("Ravi", 102);
		Student1 s3 = new Student1("Durga", 101);
		Student1 s4 = s1;
		System.out.println(s1.equals(new Object()));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));

	}
}
