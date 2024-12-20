package patterns;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 12345
// 6789
// 101112
// 
// *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows number");
		int rows = sc.nextInt();
		System.out.println("Enter column number");
		int cols = sc.nextInt();
		int num=1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j< cols; j++) {
				System.out.print(num +" ");
				num=num+1;
			}
			cols = cols - 1;
			System.out.println();
		}

	}

}
