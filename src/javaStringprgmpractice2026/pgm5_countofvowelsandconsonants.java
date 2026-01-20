package javaStringprgmpractice2026;

public class pgm5_countofvowelsandconsonants {

	public static void main(String[] args) {
		//countting vowelsand consonants from given string
		
		String str = "Saba";
		str = str.toLowerCase();
		int vowels =0;
		int consonants =0;
		
		for(char c:str.toCharArray()) {
			
			if(c!=' ') {
				if(c=='a'||c=='e'||c=='i'|| c=='o'||c=='u') {
					vowels++;
				}
				
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowls =" + vowels);
		System.out.println("Consonants ="+ consonants);
		

	}

}
