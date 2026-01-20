package patterns;

public class Printing_Words_Assendingorder_accordingto_length {

	public static void main(String[] args) {
	//	String str1 = "i like and love java programming";
   // o/p - i and like love java programming
		
		String str1 ="you and me didn't and love java programming";
		String word[] = str1.split(" ");
		String temp;
		for(int i =0; i< word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
	    		  if(word[i].length()>word[j].length()) {
	    			  temp=word[i];
	    			  word[i]=word[j];
	    			  word[j]=temp;     
	    		  }
		}
			System.out.print(word[i] + " ");
		}
		
	}
}


