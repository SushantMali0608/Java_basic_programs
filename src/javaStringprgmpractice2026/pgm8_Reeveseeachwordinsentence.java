package javaStringprgmpractice2026;

public class pgm8_Reeveseeachwordinsentence {

	public static void main(String[] args) {
		String sentence = "never give up";
		String array[] =sentence.split(" ");
		String reverse ="";
		
		for(int i=0;i<array.length;i++) {
			for(int j=array[i].length()-1;j>=0;j--) {
				reverse = reverse + array[i].charAt(j);
			}
		}
      System.out.println(reverse);
	}

}
