package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Faizan", "Software Engineer"));
		emp.add(new Employee(3, "Bhavesh", "Data Analyst"));
		emp.add(new Employee(2, "Ravi", "Telecome Engineer"));

 //		System.out.println(emp);
		
		//comparable
		//Collections.sort(emp);

		//comparator
//		Collections.sort(emp,new CustomisedSortingOrder());
		//using Comparator with lambda expression
		Collections.sort(emp, (a,b)-> a.getId() -b.getId());
		System.out.println(emp);
		Collections.sort(emp,(a,b)-> a.getName().compareTo(b.getName()));
		System.out.println(emp);
		
		ArrayList<Employee> emp1 = new ArrayList<Employee>(emp);
		
		Collections.sort(emp1,new NameComparator());
		System.out.println(emp1);
		//we can pass the interface without implementing it due to one SAM in interface.
	}

}
