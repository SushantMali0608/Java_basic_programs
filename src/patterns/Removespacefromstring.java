package patterns;

import java.util.Scanner;

public class Removespacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String input =sc.nextLine();
		input = input.replaceAll(" ", "");
		System.out.println(input);
		
		

 }

}
