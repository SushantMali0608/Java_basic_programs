package patterns;

public class countofnumberofoccuranceofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s ="sushant is a boy and harshad is also boy";
         String input= "and";
         String words[] = s.toLowerCase().split(" ");
         int occurance =0;
         for(int i=0;i< words.length;i++) {
        	 if(words[i].equalsIgnoreCase(input)) {
        		 occurance ++;
        	 }
         }
         System.out.println("occurance of " + input +" is "+ occurance);
         
	}

}


