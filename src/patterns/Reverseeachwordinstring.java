package patterns;

public class Reverseeachwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = "Sushant Sidram Mali";
      String namearray[]=name.split(" ");
      String revname = "";
//      for(int i=namearray.length-1;i>=0;i--) {
//    	  revname=revname +" "+ namearray[i];
//    	  
//      }
//      System.out.println(revname);


	
//	Reverse Each charater from String
//	for(int i=0; i<namearray.length;i++) {
//		
//		StringBuilder w =new StringBuilder(namearray[i]);
//		w.reverse();
//		revname =revname +" " +w;
//		
//	}
//	System.out.println(revname);
      
      //reversing character from string
      
      for(int i=0;i<namearray.length; i++) {
    	  int len =namearray[i].length();
    	  for(int j =len-1;j>=0;j--) {
    		  revname=revname + namearray[i].charAt(j);
    		 
    	  }
    	  revname=revname + " " ;
      }
      System.out.println(revname);
	}
}


