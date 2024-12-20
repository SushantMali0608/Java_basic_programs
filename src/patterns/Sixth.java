package patterns;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*****
// ***
//  *
// ***
//***** 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of cols");
		int cols = sc.nextInt();
		int star = 5;
		int space = 1;
		int mid = rows / 2;
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < mid + 1; j++) {
//				for (int k = 0; k < space; k++) {
//					System.out.print("  ");
//				}
//				for (int l = 0; l < star; l++) {
//
//					System.out.print("* ");
//				}
//				space = space + 1;
//				star = star - 2;
//				System.out.println();
//			}
//			
////			for (int m = mid; m < cols; m--) {
////				for (int n = 0; n < space; n++) {
////					System.out.print("  ");
////				}
////				for (int o = 0; o <star; o++) {
////
////					System.out.print("* ");
////				}
////				space = space - 1;
////				star = star + 2;
////				System.out.println();
////			}
//			
//		}
		
		for (int i = 0; i <= rows/2; i++) {
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
		space = space - 2;
		star = star + 4;
		for (int i = rows/2+1; i < rows; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for (int k = 0; k < star; k++)
			{
				System.out.print("* ");
			}
			space = space - 1;
			star = star + 2;
			System.out.println();
		}
	}
}
