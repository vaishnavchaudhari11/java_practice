
public class ReverseANumber {
	
	
	public static void reversenumber(int num) {
		
		
		int rev = 0;
		int r = 0;
		
		while(num !=0) {
			
			r = num % 10;
			rev = rev *10 + r;
			num = num/10;
			
		}
		
		System.out.println("Reverse number = " + rev);
	}
	
	
	
	public static void main(String[] args) {
		
		reversenumber(1234);
	}

}
