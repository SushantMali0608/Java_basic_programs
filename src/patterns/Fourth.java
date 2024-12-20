package patterns;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	  *	
//   **		
//  ***		
// ****		
//*****	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns");
		int cols = sc.nextInt();
		int space = 4;
		int star = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("* ");
			}
			space = space - 1;
			star = star + 1;
			System.out.println();
		}

	}

}
