package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("ob.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Student student = (Student) ois.readObject();
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getAge());
			System.out.println(student.getAddress());
			student.displayName(); 
			ois.close();
			fis.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
