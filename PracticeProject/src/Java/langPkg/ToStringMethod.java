package Java.langPkg;
class Student{
	String name;
	int rollno ;
	Student(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString() {     ///Overriding the toString() method
		return name+"..."+rollno;
		
	}
}

public class ToStringMethod {

	public static void main(String[] args) {
		Student s1=new Student("Prachi",10);
		Student s2=new Student("Manisha",20);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		

	}

}
