import java.util.ArrayList;

public class ArraySumDivisbleByK {
	
	public static void arraycountdivisblebyK() {
		
		
		int[] arr = {5,9,36,74,52,31,42};
		
		ArrayList<int[]> list = new ArrayList<>();
		
		int k = 3;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if((arr[i] + arr[j]) % k == 0) {
					
					//System.out.println(arr[i] + " " + arr[j]);
					list.add(new int[]{arr[i],arr[j]});
				}
			}
		}
		
		for(int[] List : list) {
			
			System.out.println(List[0] + " -- " + List[1]);
		}
		
		System.out.println("Total pairs divisible by " + k+ " ----- " + list.size());
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		arraycountdivisblebyK();
		
		
		
		
		
	}

}
