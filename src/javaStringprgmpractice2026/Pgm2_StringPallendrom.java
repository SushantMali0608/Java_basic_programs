package javaStringprgmpractice2026;

public class Pgm2_StringPallendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //String pallendrom or not
		
		String name ="sushant";
		String reverse ="";
		for(int i =name.length()-1; i>=0;i--) {
			
			reverse =reverse +name.charAt(i);
		}
		
		if(reverse.equals(name)) {
			System.out.println("Pallendrome");
		}
		
		else {
			System.out.println("notPallendrome");
		}
		
		//StringBuffer
		
		StringBuilder str = new StringBuilder(name);
		StringBuilder rev = str.reverse();
		
		if(name.equals(rev)) {
			System.out.println("Pallendrome");
		}
		
		else {
			System.out.println("notPallendrome");
		}
		
	}

}
