package javaStringprgmpractice2026;

public class pgm7_NonRepeatingcharactersfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="never give up";
		String nonrepeat ="";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
			if(name.indexOf(name.charAt(i)) == name.lastIndexOf(name.charAt(i))) {
			  nonrepeat = nonrepeat + name.charAt(i);
			}
		}
		
	}
		System.out.println(nonrepeat);
	}
}
