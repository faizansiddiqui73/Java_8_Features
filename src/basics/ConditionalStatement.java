package basics;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		int button = s.nextInt();
		//		if (button ==1) {
		//			System.out.println("Hello");
		//		} else if (button==2) {
		//			System.out.println("Namste");
		//		} else if(button==3) {
		//			System.out.println("Bonjour");
		//		} else {
		//			System.out.println("Invalid Button");
		//		}
		switch (button) {
		case 1 : 
			System.out.println("Hello");
			break;
		case 2 :
			System.out.println("Namaste");
			break;
		case 3 : 
			System.out.println("Bonjour");
			break;
		default :
			System.out.println("Invalid Button");
		}
	}

}
