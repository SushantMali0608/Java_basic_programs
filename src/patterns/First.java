package patterns;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//* * * * *
//  * * *
//    *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows size");
		int rows = sc.nextInt();
		System.out.println("Enter cols size");
		int cols = sc.nextInt();
		int star = cols;
		int space = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("* ");
			}
			space = space + 1;
			star = star - 2;
			System.out.println();
		}
	}
}
