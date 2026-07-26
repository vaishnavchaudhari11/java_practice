
public class ReverseStringPreservingSpace {
	
	
	public static void reversepresevespace(String str) {
		
		
		String reverse = "";
		
		
		for(int i = str.length()-1;i>=0;i--) {
			
			reverse += str.charAt(i);
			
		}
		
		System.out.println("String original reverse : "+ reverse);
		
		
		String combineAll = reverse.replaceAll(" ", "");
		System.out.println("String reverse combine : "+ combineAll);
		
		
		String finalString = "";
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == ' ') {
				
				finalString += " ";
			}
			else {
				
				finalString += combineAll.charAt(count);
				count++;
			}
		}
		
		
		System.out.println("Final String : "+ finalString);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		reversepresevespace("My name is Vaishnav");
		
	}

}
