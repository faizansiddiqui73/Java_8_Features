package contentComparsion;

public class Student {
	int x = 34;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Comparing Objects");
		// TODO Auto-generated method stub
		Student st = (Student) obj;
		return st.x == this.x;
	}
	
	
}
	