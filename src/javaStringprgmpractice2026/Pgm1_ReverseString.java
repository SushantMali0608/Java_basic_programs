package javaStringprgmpractice2026;

public class Pgm1_ReverseString {

	public static void main(String[] args) {
		// reverse String program
		
		String name = " i love java";
		String reverse ="";
		
		for(int i =name.length()-1; i>=0;i--) {
			
			reverse = reverse + name.charAt(i);
			
		}
		System.out.println(reverse);
		
		//Using StringBuilder(it is a class and creates a mutable sequence of characters we can modify content without creating new object)
		
		StringBuilder str=new StringBuilder(name);
		
		str.reverse();
		System.out.println(str);
		

	}

}
