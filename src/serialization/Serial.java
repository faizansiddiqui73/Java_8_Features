package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {
		try {
			//create object of Student
			Student student = new Student("Faizan Siddiqui","faizansiddiqui73@gmail.com",24,"Puranpur");

			// write data to file 
			FileOutputStream fos = new FileOutputStream("ob.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//how to serialize
			oos.writeObject(student);
			
			oos.close();
			fos.close();
			System.out.println("Object stated is transferred to file ob !!");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
