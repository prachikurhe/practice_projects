package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	String name;
	int id;
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return name+"  "+id;
		
	}
	public int compareTo(Object obj) {
		int id1=this.id;
		Employee e=(Employee)obj;
		int id2=e.id;
		if(id1<id2) {
			return -1;
		}
		else if(id1>id2) {
			return +1;
		
			}
		else return 0;
		}
		

		
	}
class MyComparator5 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	
}
public class ComparableComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Pratiksha",105);
		Employee e2=new Employee("Prachi",103);
		Employee e3=new Employee("Aniket",102);
		Employee e4=new Employee("Tushar",104);
		Employee e5=new Employee("Gaurav",101);
		
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet(new MyComparator5());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);

	}

}
