package patterns;

public class removingdigitsandsymbolfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "sushantmali2016@gmail.com";
		
		//easy code
//		int count =0;
//		char array[]=str.toCharArray();
//		for(int i=0;i<array.length;i++) {
//			char ch=array[i];
//			if(Character.isLetter(array[i])) {
//				array[count] =array[i];
//				count++;
//			}
//		}
//			
//			for(int i= count-1;i>=0;i--) {
//				System.out.print(array[i]);
//			
//		}
		
		//my try
//		char array[]=str.toCharArray();
//		String str2 ="";
//		for(int i=0;i<array.length;i++) {
//			char ch =array[i];
//			if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z') {
//			 str2=str2 + array[i];
//			}
//			}
//		char array2[]=str2.toCharArray();
//		String str3 ="";
//		for(int i= array2.length-1;i>=0;i--) {
//		   str3=str3 + array2[i];
//		}
//		System.out.println(str3);
		
		
		String str = "sushantmali2016@gmail.com";
		char array[] =str.toCharArray();
		String name ="";
		for(int i= array.length-1;i>=0;i--) {
			   char c = array[i];
				if(Character.isLetter(c)) {
					name=name +c;
				}
			}
		System.out.print(name);
		}

		
		}


