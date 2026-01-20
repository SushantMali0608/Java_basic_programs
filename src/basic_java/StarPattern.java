package basic_java;
import java.util.*;

public class StarPattern {

	public static void main(String[] args) {
//	//  *
//		**
//		***
//		****
//		*****
		
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number of rows");
      int rows = sc.nextInt();
      System.out.println("Enter number of cols");
      int columns =sc.nextInt();
      
      for(int i =0;i<rows;i++) {
    	  for(int j=0;j<=i;j++) {
    		  System.out.print(" *");
    	  }
    	  System.out.println(" ");
      }
      
//reverse pattern
      for(int i =rows;i>0;i--) {
    	  for(int j=i;j>0;j--) {
    		  System.out.print(" *");
    	  }
    	  System.out.println(" ");
      }
      
      
System.out.println("********************************************************************************");
//   *
//  ***
// *****
 int space =2;
 int star =1;
		 
for(int i=0;i<3;i++) {
	for(int j=0;j<space;j++) {
		System.out.print("  ");
	}
	for(int k=0;k<star;k++) {
		System.out.print("* ");
	}
	space =space-1;
	star =star+2;
	System.out.println();
}

System.out.println("***************************************************************************");

for(int a=1;a<=5;a++){
	for(int b=5;b>=a;b--) {
		System.out.print(" ");
	}
	for(int c=1;c<=a;c++) {
		System.out.print(" *");
	}
	System.out.println(" ");
	}


















	}

}
