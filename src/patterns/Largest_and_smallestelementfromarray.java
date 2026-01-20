package patterns;

public class Largest_and_smallestelementfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//largest number
		int arr1[]= {1,10,50000,100,50,1000};
		int largest =arr1[0];
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i]>largest) {
				largest =arr1[i];
				
			}
			
		}
		System.out.println(largest);
		
//		//smallest number
//				int arr2[]= {1,10,20,100,50,1000};
//				int smallest =arr2[0];
//				for(int i =0;i<arr1.length;i++) {
//					if(arr2[i]<smallest) {
//						smallest =arr2[i];
//						
//					}
//					
//				}
//				System.out.println(smallest);
//		
//
	}

	}

