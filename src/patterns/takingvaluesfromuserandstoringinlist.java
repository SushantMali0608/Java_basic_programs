package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class takingvaluesfromuserandstoringinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 =new ArrayList<Integer>();
		List<Integer> l2 =new ArrayList<Integer>();
		int num;
	System.out.println("Enter 5 Values");
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<5;i++) {
		num=sc.nextInt();
		if(num %2 ==0) {
			l1.add(num);
		}
		else {
			l2.add(num);
		}
	}
    sc.close();
    System.out.println(l1);
    System.out.println(l2);

	}

}

