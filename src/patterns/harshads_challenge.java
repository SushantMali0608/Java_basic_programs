package patterns;

public class harshads_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 2  3   4
//		  12 13 14  5
//          11 16 15 6
//          10 9  8   7
		
		int rows =4;
		int cols =4;
		int sum =0;
		int space =3;
		
		for(int i=0;i< rows;i++) {
			if(i==0)
			for(int j=0;j<cols;j++) {
			System.out.print(sum =sum+1);
			if(j==3) {
				for(int l =1;l<j;l++) {
				System.out.println();
				for(int k=0;k<space;k++) {
			System.out.print(" ");
			}
				for(int L =0;L<1;L++) {
					System.out.print(sum=sum+1);
				
				}
				}
			}
			}
			 if(i==3) {
				 sum = sum + (i+1);
			   int tempsum = sum;
				 System.out.println();				 
				 for(int m =0;m<= i;m++) {
					 System.out.print(sum);
					 sum=sum-1;
				 }
				 
			 
				 
			 }
			
		}
	}
}
		
		
		
		


		

