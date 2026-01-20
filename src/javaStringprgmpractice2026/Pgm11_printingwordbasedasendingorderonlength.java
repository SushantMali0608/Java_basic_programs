package javaStringprgmpractice2026;

public class Pgm11_printingwordbasedasendingorderonlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String =" i love java and automation"
		//op = "i and love java automation";
		
		String str = "i love java and automation";
		
		String array[]=str.split(" ");
		
		for(int i=0;i<array.length-1;i++) {
			
			for(int j=0; j<array.length-1;j++) {
				
				String temp ="";
				
				if(array[j].length() > array[j+1].length()) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
			
		}
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}

	}

}
