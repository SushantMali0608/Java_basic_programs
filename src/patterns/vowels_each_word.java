package patterns;

public class vowels_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  given  string = "l Love java Programming";
		//o/p - number of vowels = i=1,love=2,java=2,programming =3
		
		String str = "I Love java Programming";	
		String[] strarray=str.split(" ");
		for(int i=0;i<strarray.length;i++) {
			int count=0;
		 String word = strarray[i].toLowerCase();
		 for(char ch :word.toCharArray()) {
			 if(ch  =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u') {
				 count = count + 1;
			 }
		 }
		 
		System.out.println(strarray[i] + "=" + count);
		}
		
	}

}
