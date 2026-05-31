import java.util.Scanner;

public class FirstNonRepetatingcharacter {
	
	public static String firstnonrepeat(String str) {
		String result ="";
		for(int i=0;i<str.length();i++) {
			
			int count = 0;
			
			if(str.charAt(i)!=' ' ) {
				
			
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j) && i!=j) {
					count++;
					break;
					
				}
			}
			
			if(count == 0) {
				result += str.charAt(i);
				break;
			}
		}
			}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		String result = firstnonrepeat(str);
		System.out.println(result);
	}

}
