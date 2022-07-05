package Practice;
class Person{
	int age;
	String name;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals (Object obj) {
		if(obj instanceof Person ) {
			Person p=(Person)obj;
			if(name.equals(p.name) && age==p.age)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	
			
		}
	public String toString() {
		return name+age;
		
	}
	public int hashCode() {
		return name.hashCode()+age;
		
	}
}
public class HashcodeExample {
	public static void main(String[] args) { 
		Person p=new Person("Prachi",23);
		Person p1=new Person("Prachi",23);
		
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
	}


