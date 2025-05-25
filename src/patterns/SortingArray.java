package patterns;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num[] = {3,2,5,4,7,8,15};
      int largest=0;
//      int temp ;
//      for(int i =0 ;i<num.length;i++) {
//    	  for(int j=i+1;j<num.length;j++) {
//    		  if(num[i]>num[j]) {
//    			  temp=num[i];
//    			  num[i]=num[j];
//    			  num[j]=temp; 
//    			
//    		  }
//    		  
//    	  }
//        	  System.out.println(num[i]);
//     
//      }
//      System.out.println(num[num.length-2]);
     //lagest number from array
     
      for(int i =0 ;i<num.length;i++) {
    	  for(int j=i+1;j<num.length;j++) {
    		  if(num[i]<num[j]) {
    		num[i]=num[j];
    		largest =num[i];
    			
    		  }
	}

}
      System.out.println("largest number=" + largest);
	}
}

