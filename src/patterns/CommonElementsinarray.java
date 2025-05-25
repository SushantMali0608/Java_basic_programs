package patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer[] arr1= {1,2,3,4,5,6,2};
	Integer[] arr2 = {2,3,4,5,6,7,2,3,8};
	List<Integer> common =new ArrayList();
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				if(common.contains(arr1[i])) {
					break;
				}
				else{
					common.add(arr1[i]);
					break;
				}
			}
		}
	}
     System.out.println(common);
		
//		By Using Arraylist with retain all Method
//	List<Integer>list1 =Arrays.asList(arr1);
//	List<Integer>list2 =Arrays.asList(arr2);
//	list1.retainAll(list2);
//     System.out.println("Common Elements" + list1);
	}

}

