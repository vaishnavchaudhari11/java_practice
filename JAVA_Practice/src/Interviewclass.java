import java.util.HashSet;
import java.util.Set;

public class Interviewclass {
	
	
	
	public static void firstDuplicate() {
		
		int[] arr = {1,2,3,4,5,6,7,4,2,4,5};
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			int count =0;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j] == arr[i] && i!=j) {
					count++;
					//break;
				}
			}
			
			if(count >0) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		System.out.println("----");
		
		Set<Integer> set = new HashSet<>();
		
		for(int k : arr) {
			
			if(!set.contains(arr[k])) {
				set.add(k);
			}
		}
		
		for(int j : set) {
			System.out.print(j + " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		firstDuplicate();
	}

}
