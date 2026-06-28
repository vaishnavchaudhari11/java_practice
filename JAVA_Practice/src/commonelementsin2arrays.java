import java.util.HashSet;
import java.util.Set;

public class commonelementsin2arrays {
	
	
	public static void commonelements() {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {6,3,2,1};
		
		for(int i=0;i<arr1.length;i++) {
			
			boolean repeated = false;
			
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i] == arr2[j]) {
					
					repeated = true;
				}
			}
			
			if(repeated) {
				System.out.println("repeated " + arr1[i]);
			}
		}
	}
	
	
	public static void commonelementsset() {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,1,4,5};
		
		Set<Integer> set = new HashSet<>();
		
		for(int a : arr1) {
			
			set.add(a);
		}
		
		for(int b : arr2) {
			if(!set.contains(b)) {
				System.out.println(b);
			}
		}
				
				
				
	} 
	
	
	
	public static void main(String[] args) {
		
		
//		commonelements();
		commonelementsset();
		
	}

}
