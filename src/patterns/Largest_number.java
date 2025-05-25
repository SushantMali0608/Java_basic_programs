package patterns;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter firset num");
		int n1= sc.nextInt();
		System.out.println("Enter scond num");
		int n2= sc.nextInt();
		System.out.println("Enter third num");
		int n3= sc.nextInt();
		if(n1 >n2 && n1 >n3) {
			System.out.println(n1 + " largest number");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2 + " largest number");
		}
		else{
			System.out.println(n3 + " largest number");
		}
}

}

