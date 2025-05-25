package patterns;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fabonaccci series means next number will sum of previous two numbers
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the total number");
		int num = sc.nextInt();
		int n1 =0;
		System.out.println(n1);
		int n2 =1;
		System.out.println(n2);
		int n3;
		for(int i =2;i<num;i++) {
			n3 =n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
    }

}

