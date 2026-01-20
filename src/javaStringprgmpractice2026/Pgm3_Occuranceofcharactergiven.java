package javaStringprgmpractice2026;

public class Pgm3_Occuranceofcharactergiven {

	public static void main(String[] args) {
		//finding the occurance of given character
		
		String word ="Shabana";
		word = word.toLowerCase();
		char letter ='a';	
		int count =0;
		
		char name[]= word.toCharArray();
		
		for(int i=0;i<=name.length-1;i++) {
			if(name[i]==letter) {
				count=count+1;
			}
		}
     System.out.println("count of given letter" + letter +"=" +count);
	}

}
