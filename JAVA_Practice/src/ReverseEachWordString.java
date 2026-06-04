
public class ReverseEachWordString {
	
	
	
	public static void reverse(String str) {
		
		String[] st = str.split(" ");
		
		String result = "";
		
		for(String s : st) {
			
			for(int i=s.length()-1;i>=0;i--) {
				
				result += s.charAt(i);
			}
			
				result += " ";
		}
		
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		
		reverse("java is program");
	}

}
