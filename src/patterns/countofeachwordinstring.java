package patterns;

import java.util.HashMap;
import java.util.Map;

public class countofeachwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input- sushant harshad yash harshad yash harshad
//	op /sushant -1
//		harshad -3
//		yash -2
// hardcoded prgram
//		
		String input ="sushant harshad yash harshad yash harshad";
//		int sushantcount =0;
//		int yashcount =0;
//		int harshadcount =0;
//		int others =0;
		String[] words =input.split(" ");
//		for(int i=0;i<words.length;i++) {
//			if(words[i].equalsIgnoreCase("sushant")) {
//				sushantcount++;
//			}
//			else if(words[i].equalsIgnoreCase("harshad")) {
//				harshadcount++;
//			}
//			else if(words[i].equalsIgnoreCase("yash")) {
//				yashcount++;
//			}
//			else {
//				others++;
//			}
//		}
//		System.out.println("count of sushant"+sushantcount);
//		System.out.println("count of harshad"+harshadcount);
//		System.out.println("count of yashcount"+yashcount);
//		System.out.println("count of sushant"+others);
		
		
//		using maps		
		HashMap<String,Integer>count=new HashMap<String,Integer>();
		
		for(String word:words) {
			if(count.containsKey(word)) {
				count.put(word,count.get(word)+1);
			}
			else {
				count.put(word,1);
			
		}
		}
		for(Map.Entry entry:count.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
	}
}