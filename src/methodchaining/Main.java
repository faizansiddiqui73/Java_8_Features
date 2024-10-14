package methodchaining;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Student student = new Student();		

		//To do the method chaining we need to return the type in void the type of object we are passing

		//		student.setName("Faizan").setAge(24).setName("Puranpur");
		//		student.setName("Faizan");
		//		student.setAge(24);
		//		student.setCity("Puranpur");

		Student s = Student.of().setName("Faizan")
				.setAge(24)
				.setCity("Puranpur");
		System.out.println(s.toString());
	}	

}
