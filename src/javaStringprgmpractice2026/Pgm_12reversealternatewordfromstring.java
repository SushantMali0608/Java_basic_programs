package javaStringprgmpractice2026;

public class Pgm_12reversealternatewordfromstring {

	public static void main(String[] args) {
		// String = "i love java programming";
		//op = "i evol java gnimmargorp"
		
		String str ="i love java programming";
	
		String str1[] = str.split(" ");
		String out="";
	for(int i =0;i<str1.length;i++) {
		StringBuilder op =new StringBuilder(str1[i]);
		if(i%2!=0) {
			
			out =out + op.reverse();
			
		}
		else {
			out = out+ str1[i];
		}
	
	}
	System.out.print(out);


	}

}
