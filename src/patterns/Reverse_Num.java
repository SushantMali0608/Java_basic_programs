package patterns;

import java.util.Scanner;

public class Reverse_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Reverse num and pallidrome or not
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = sc.nextInt();
//		int temp = num;
//		int sum =0;
//		while(num>0) {
//			int n= num%10;
//			sum=sum*10 + n;
//			num =num/10;
//		}
//		if(temp==sum) {
//			System.out.println("num is pallendrome");
//		}
//		else {
//			System.out.println("Not pallendrome");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String temp =s;
		String rev = "";
		
		for(int i= s.length()-1;i>=0;i--) {
			rev =rev +s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("String is pallendrome");
		}
		else {
			System.out.println("not pallendrome");
		}
				
	}

}
