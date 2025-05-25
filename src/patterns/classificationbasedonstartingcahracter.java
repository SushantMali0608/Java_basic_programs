package patterns;

import java.util.ArrayList;
import java.util.List;

public class classificationbasedonstartingcahracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Sushant hardshad harami sunset";
		List<String>l1 =new ArrayList<>();
		List<String>l2 =new ArrayList<>();
		String array[] = line.toLowerCase().split(" ");
		for(int i=0;i<array.length;i++) {
			if(array[i].charAt(0)=='s'&& array[i].charAt(1)=='u') {
				
				l1.add(array[i]);
			}
			else if(array[i].charAt(0)=='h'&& array[i].charAt(1)=='a') {
				l2.add(array[i]);
			}
	
			}
		System.out.println(l1);
		System.out.println(l2);
		}
		

	}
