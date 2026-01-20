package javaStringprgmpractice2026;

public class Pgm10_countofvowelsineachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String = "I like java Programming";
	//OP =i =1;
		//like =2;
		//java=2;
		//progrmaming =3
		
		String str ="I like java Programming";
		
		String [] str1 = str.split(" ");
		
		for (int i= 0;i<str1.length;i++) {
			
			int count =0;
			String word =str1[i].toLowerCase();
			for(char c : word.toCharArray()) {
				if (c =='a'||c =='e'||c=='i'||c=='o' ||c=='u') {
					count ++;
				}
			}
			System.out.println(word +"="+count);
		}
		
	}

}
