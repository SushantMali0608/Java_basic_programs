package patterns;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no rows");
		int rows = sc.nextInt();
		System.out.println("Enter no cols");
		int cols = sc.nextInt();
		int star =1;
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<star;j++) {
//				System.out.print("* ");
//			}
//			star=star+1;
//			System.out.println();
//		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

    }

}


