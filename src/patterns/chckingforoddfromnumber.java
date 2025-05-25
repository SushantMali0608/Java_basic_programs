package patterns;

import java.util.Scanner;

public class chckingforoddfromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int temp;
		boolean odd=false;
		while(num>0) {
			temp= num%10;
			if(temp%2==0) {
				odd=false;
			break;
			}
			else {
				odd=true;
			}
			num=num/10;
		}
		if(odd==true) {
			System.out.println("number ontains all odd");
		}
		else{
			System.out.println("number contain even");
		}

	}

}
