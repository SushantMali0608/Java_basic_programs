package patterns;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str= sc.next();
//		String s2="";
//		for(int i=str.length()-1;i>=0;i--) {
//			s2=s2 + str.charAt(i);
//		}
//		System.out.println(s2);
		
//Using string reverse method
		StringBuilder input1 =new StringBuilder();
		input1.append(str);
		input1.reverse();
		System.out.println(input1);
    }

}
