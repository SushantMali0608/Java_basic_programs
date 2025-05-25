package patterns;

import java.util.Scanner;

public class additionofeachdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0;
		int temp;
		
		while(num>0) {
		   temp = num%10;
		   sum=sum+temp;
		   num =num/10;
		}
		System.out.println(sum);
	}
}
