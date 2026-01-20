package javaStringprgmpractice2026;

import java.util.HashMap;
import java.util.Map;

public class Pgm4_Occuranceofeachcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //occurance of each char of Given String
		
		String word = "shabana";
		char name[]=word.toCharArray();
		
		for(char ch : name) {
			int count =0;
			for(char c : name) {
				if(ch==c) {
					count =count+1;
				}
				
			}
			System.out.println("count of"+ch +"=" + count);
		}
	
	//using hashmap
	
	HashMap <Character,Integer> count = new HashMap<Character,Integer>();
	for(char c:name) {
		
		if(c!=' ') {
			if(count.containsKey(c)) {
				count.put(c,count.get(c)+1);
			}
			else {
				count.put(c,1);
			}
		}
	}
	 for(Map.Entry entry:count.entrySet()) {
		 System.out.println(entry.getKey()+"="+entry.getValue()+",");
	 }
}
}
