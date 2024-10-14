package predicateANDstreamANDfunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {
//	private static String function2(String s) {
//		return s.substring(0,2);
//	}
	
	public static void main(String[] args) {
		Function<String, Integer> function1 = x-> x.length();
		Function<String, String> function2 = s-> s.substring(0,2);
		
		
		Function<List<Student>, List<Student>> studentsWithPrefixAsVi = li ->{
		List<Student> ans = new ArrayList<>();

		for(Student s:li) {
			if(function2.apply(s.getName()).equalsIgnoreCase("Vi")) {
				ans.add(s);
			}
		}
		return ans;
	};


		Student s1 = new Student("Vipul",20);
		Student s2 = new Student("Vikash", 12);
		Student s3 = new Student("Anshul", 23);

		List<Student> students = Arrays.asList(s1,s2,s3);
		//		List<Student> filteredStudents = studentsWithPrefixAsVi(students);
		List<Student> filter = studentsWithPrefixAsVi.apply(students);
		System.out.println(filter);

	}
	private static class Student{
		private String name;
		private int age;
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
	}

}


