
public class Plaindromenumber {
	
	public static void palindromenumbercheck(int num) {
		
		
		int reversednumber = num;
		int rev = 0;
		int r = 0;
		
		
		while(num !=0) {
			
			r = num % 10;
			rev = rev * 10 + r;
			num = num/10;
		}
		
		if(rev == reversednumber) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("Number is not paliondrome");
		}
	}
	
	
	public static void main(String[] args) {
		
		palindromenumbercheck(1221);
	}

}
