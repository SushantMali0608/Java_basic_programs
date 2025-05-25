package patterns;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array [] = {1,2,3,2,4,5,4,3,3,6,7,5,5,5};
//		List <Integer> duplicate =new ArrayList();
//		int count = 0;
//		for(int i=0; i < array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				if(array[i]==array[j]) {
//					if(duplicate.contains(array[i])){
//						break;
//					}
//					else {
//					duplicate.add(array[i]);
//					break;
//					}
//					
//				}
//			}
//			
//		}
//	
//		System.out.println(duplicate);
		int array[]={3,2,4,1,5,8,7,7,5,4,4,3,};
        List<Integer> l1= new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    if(l1.contains(array[i])){
                        break;
                    }
                    else{
                        l1.add(array[i]);
                    }
                }
                
            }
        }
       System.out.print(l1);

	}

}


