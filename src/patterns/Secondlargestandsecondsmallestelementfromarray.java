package patterns;

import java.util.Arrays;

public class Secondlargestandsecondsmallestelementfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,5,9,8};
//		int num =array.length;
//		Arrays.sort(array);
//		System.out.println("Second largest element" + array[num-2]);
//		System.out.println("Second smllest element" + array[1]);

		

//	}
	
	//Second largest Element 
	
//	if(array.length<2) {
//		System.out.println("array must have 2 elements");
//	}
//	int first=array[0];
//	int second=Integer.MIN_VALUE;
//	 
//	for(int i=1;i< array.length;i++) {
//		if(array[i]>first) {
//			second=first;
//			first =array[i];
//		}
//		else if(array[i]>second && array[i]!=first) {
//			second =array[i];
//		}
//	}
//	
//	
//	if(second==Integer.MIN_VALUE) {
//		System.out.println("all values are same");
//	}
//	else {
//		System.out.println("Second largest value" + second);
//	}
	
	//second smallest
	
	//Second largest Element 
	
		if(array.length<2) {
			System.out.println("array must have 2 elements");
		}
		int first=array[0];
		int second=Integer.MAX_VALUE;
		System.out.println(second);
		 
		for(int i=1;i< array.length;i++) {
			if(array[i]<first) {
				second=first;
				first =array[i];
			}
			else if(array[i]<second && array[i]!=first) {
				second =array[i];
			}
		}
		
		
		if(second==Integer.MAX_VALUE) {
			System.out.println("all values are same");
		}
		else {
			System.out.println("Second smallest value" + second);
		}
	
	}
}

