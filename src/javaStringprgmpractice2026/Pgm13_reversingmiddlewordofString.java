package javaStringprgmpractice2026;

public class Pgm13_reversingmiddlewordofString {

	public static void main(String[] args) {
		// String = "Money is everything";
		//op ="Money si everything"
		
		String str ="Money is everyting";
		String words[] = str.split(" ");
		int middle =words.length/2;
		String reverse ="";
		
		for (int i = words[middle].length()-1;i>=0;i--) {
			
			reverse =reverse + words[middle].charAt(i);
		}

		words[middle]=reverse;
		
		System.out.print(String.join(" ", words));
		
		
	}

}
