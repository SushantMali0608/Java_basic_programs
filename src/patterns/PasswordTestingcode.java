package patterns;

import java.util.Scanner;

public class PasswordTestingcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = sc.nextLine();
		char array[] = password.toCharArray();
		boolean pass = false;
		boolean hasuppercase = false;
		boolean haslowercase = false;
		boolean hassymbol = false;
		boolean hasdigit = false;
		if (password.length() >= 8) {
			pass = true;
		} else {
			pass = false;
		}

		for (char c : array) {
			if (Character.isUpperCase(c)) {
				hasuppercase = true;
			} else if (Character.isLowerCase(c)) {
				haslowercase = true;
			} else if (!Character.isLetterOrDigit(c)) {
				hassymbol = true;
			} else if (Character.isDigit(c)) {
				hasdigit = true;
			}

		}

//		if(pass) {
//			System.out.println("length is ok");
//		}
//		else{
//			System.out.println("length is not ok");
//		}
//		
//		if(hasuppercase) {
//			System.out.println("uppercase added");
//		}
//		else{
//			System.out.println("uppercase missing");
//		}
//		
//		if(haslowercase) {
//			System.out.println("lower case is there");
//		}
//		else{
//			System.out.println("lowercase missing");
//		}
//		if(hassymbol) {
//			System.out.println("symbol added");
//		}
//		else{
//			System.out.println("symbol not added");
//		}

		if (pass && hasuppercase && haslowercase && hassymbol && hasdigit) {

			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}

	}
}
