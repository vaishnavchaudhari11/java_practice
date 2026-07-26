import java.util.Arrays;

public class MoveZerotoEnd {
	
	
	public static void movezewroteoend() {
		
		int[] arr = {2,0,5,0,3,0,0,7,0};
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] != 0) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	} 

	
	public static void main(String[] args) {
		
		movezewroteoend();
	}
}
