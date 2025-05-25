package patterns;

import java.util.Arrays;
import java.util.Collections;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {76,3,34,5,11,2,1,0};
		int temp;
//		
//		for(int i =0;i<array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				if(array[i]>=array[j]) {
//					temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//				
//				}
//				
//			}
//		}		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
//		System.out.println("largest element " + (array[array.length-1]) );
//		System.out.println("smallest element " + (array[0]));
//		System.out.println("secondlargest element " + (array[array.length-2]) );
//		System.out.println("secondsmallest element " + (array[1]) );
		
		
		//using sort method
		
//		 Arrays.sort(array);
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]);
//		}
//		System.out.println("largest element " + (array[array.length-1]) );
//		System.out.println("smallest element " + (array[0]));
//		System.out.println("secondlargest element " + (array[array.length-2]) );
//	    System.out.println("secondsmallest element " + (array[1]) );
		
		
		// array sorting in decending order
		for(int i =0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<=array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
					
				}
				
			}
		}		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		
		
		

	}

	
	}	
}
