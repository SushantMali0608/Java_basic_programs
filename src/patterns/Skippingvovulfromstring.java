package patterns;

public class Skippingvovulfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="sidram";
		String name2 ="";
       String name1=name.toLowerCase();
        char namearray[]=name1.toCharArray();
		
		for(int i =0;i<namearray.length;i++) {
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u' ) {
				//skipps
			}
			else {
				name2 =name2 +namearray[i];
			}
		}
		System.out.println(name2);

	}

}
