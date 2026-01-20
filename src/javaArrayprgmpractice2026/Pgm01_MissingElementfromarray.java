package javaArrayprgmpractice2026;

public class Pgm01_MissingElementfromarray {

	public static void main(String[] args) {
		//values ={1,3,4,5,6,8,9}
		//op =2,7;
		
		int values[] = {1,3,4,5,6,8,9};
		
		for(int i=0;i<values.length-1;i++) {
			
			if(values[i+1]!=values[i]+1) {
				System.out.println(values[i]+1);
			}
		}

	}

}
