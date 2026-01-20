package javaStringprgmpractice2026;

import java.util.List;

public class pgm6_removingduplicatefromstring {

	public static void main(String[] args) {
		// removingduplicatesfromstring
		
		String str ="Saba";
		String duplicate ="";
		
		str =str.toLowerCase();
		for(int i =0;i<str.length();i++){
			//using String.Valueof to converting char to String;
			if(!duplicate.contains(String.valueOf(str.charAt(i)))) {
				duplicate = duplicate +str.charAt(i);
			}
			
		}
		
		System.out.println(duplicate);
	}

}
