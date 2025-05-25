package patterns;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Amstrong number is nothing but the sum of cube of all digit is equal to the orignal number
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num;
		int sum =0;
		while(num>0) {
			int n=num%10;
			sum =sum +(n*n*n);
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("not amstrong");
		}
	
	}
}
