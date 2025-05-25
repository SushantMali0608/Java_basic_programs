package patterns;

import java.util.ArrayList;
import java.util.List;

public class StartWithspecificlettersprgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input -String -Sushant Harshad Yash Vedant Sourbh Abhi
//output -
//		Start with S = Sushant Sourabh
//		Start with H = Harshad
//		Start with Y =Yash
//		Other =Vedant abhi
		
		String input ="Sushant Harshad Yash Vedant Sourbh Abhi";
		String [] words =input.split(" ");
		List<String> s =new ArrayList<>();
		List<String> h =new ArrayList<>();
		List<String> y =new ArrayList<>();
		List<String> o =new ArrayList<>();
//		for(String word:words) {
//			if(word.startsWith("S")) {
//				s.add(word);
//			}
//			else if(word.startsWith("H")) {
//				h.add(word);
//			}
//			else if(word.startsWith("Y")) {
//				y.add(word);
//			}
//			else {
//				o.add(word);
//			}
//		}
		
//		System.out.println("Start with S " +s);
//		System.out.println("Start with H " +h);
//		System.out.println("Start with Y " +y);
//		System.out.println("Start with ohters " +o);
		
		//Anather Method
		
		for(String word:words) {
			if(word.charAt(0)=='s'|| word.charAt(0)=='S') {
				s.add(word);
			}
			else if(word.charAt(0)=='h'|| word.charAt(0)=='H') {
				h.add(word);
			}
			else if(word.charAt(0)=='y'|| word.charAt(0)=='Y') {
				y.add(word);
			}
			else {
				o.add(word);
			}
		}
		
		System.out.println("Start with S " +s);
		System.out.println("Start with H " +h);
		System.out.println("Start with Y " +y);
		System.out.println("Start with ohters " +o);
				
		
		
		
	}

}
