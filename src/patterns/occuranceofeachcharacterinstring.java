package patterns;

import java.util.HashMap;
import java.util.Map;

public class occuranceofeachcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "sushant sidram mali";
//		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
//		char chararray [] = name.toCharArray();
//		for(char c:chararray) {
//			if(c!=' ') {
//				if(count.containsKey(c)) {
//					count.put(c, count.get(c)+1);
//				}
//				else {
//					count.put(c, 1);
//				}
//			}
//			}
//		for(Map.Entry entry:count.entrySet()) {
//			System.out.print(entry.getKey()+"="+entry.getValue()+",");
//		}
//		
////// occurance of each number in array
//		
//		int num [] = {1,2,1,4,5,3,2,2,2};
//		HashMap<Integer,Integer> numcount = new HashMap<Integer,Integer>();
//		for(int i:num) 
//				if(numcount.containsKey(i)) {
//					numcount.put(i, numcount.get(i)+1);
//				}
//				else {
//					numcount.put(i, 1);
//				}
//		for(Map.Entry entry:numcount.entrySet()) {
//			System.out.println(entry.getKey()+"="+entry.getValue()+",");
//		}
//		}
		
		String lang ="java is a programing language";
		char arr[] = lang.toLowerCase().toCharArray();
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		
		for(char a:arr) {
			if(a!=' ') {
				if(count.containsKey(a)) {
					count.put(a, count.get(a)+1);
				}
				else {
					count.put(a, 1);
				}
			}
		}
         for(Map.Entry entry :count.entrySet()) {
        	 System.out.println(entry.getKey()+"="+entry.getValue()+",");
         }
	}

}

