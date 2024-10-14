package sorting;

public class Employee{
	
//implements Comparable<Employee>{
//
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		//this represents current object
//		return this.Id - o.Id;
//	}


	private int Id;
	private String name;
	private String Designation;


	public Employee(int id, String name, String designation) {
		super();
		Id = id;
		this.name = name;
		Designation = designation;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", Designation=" + Designation + "]";
	}

}

