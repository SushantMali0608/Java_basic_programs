package javaStringprgmpractice2026;

public class Pgm9_Reversinglstwordofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //input ="java is programing language"
		//op = java is programming egaugnal
		
		String name = "java is programing language";
		
		String array [] = name.split(" ");
		String reverse = "";
		String word =array[array.length-1];
		for(int j =word.length()-1; j>=0;j--) {
			
			reverse = reverse + word.charAt(j);
			
		}
		array[array.length-1]=reverse;
		System.out.println(String.join(" ", array));
		
	}

}
