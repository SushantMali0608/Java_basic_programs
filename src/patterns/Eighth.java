package patterns;

import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//10
		//101
		//1010
				 Scanner sc =new Scanner(System.in);
				 System.out.println("Enter number of rows");
				 int rows = sc.nextInt();
				 System.out.println("Enter number of cols");
				 int cols = sc.nextInt();
				 for(int i=0;i<rows;i++) {
					 for(int j=0;j<=i;j++) {
						if(j%2==0) {
							System.out.print("1");
						} 
						else {
							System.out.print("0");
						}
						 
					 }
					 System.out.println();
				 }
				 

					

	}

}