package StreameDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new ArrayList<Employee>();
		Employee e1=new Employee("A",20,20000);
		Employee e2=new Employee("B",30,30000);
		Employee e3=new Employee("C",40,40000);
		Employee e4=new Employee("D",35,50000);
		Employee e5=new Employee("E",45,60000);

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		System.out.println("Original Salary...");
		System.out.println(emp);
		
		
		List<Employee> increamentSalary=	emp.stream().map(e->{
			if(e.getAge()>40) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		
		
		System.out.println("increamentSalary...");
		System.out.println(increamentSalary);

	}

}
