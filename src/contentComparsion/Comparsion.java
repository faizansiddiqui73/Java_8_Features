package contentComparsion;

public class Comparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1==s2); // Reference Comparison
		System.out.println(s1.equals(s2)); // Reference Comparison
		//equals method modified for the content comparison
		
		
	}

}
