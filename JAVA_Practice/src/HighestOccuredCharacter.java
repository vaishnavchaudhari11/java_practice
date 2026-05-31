import java.util.Scanner;

public class HighestOccuredCharacter {
	
	public static void highestoccurchar(String str) {
		
		int max =0;
		char result = ' ';
		for(int i=0;i<str.length();i++) {
			
			int count =1;
			
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			
			if(max < count) {
				max = count;
				result = str.charAt(i);
			}
		}
		
		System.out.println("Highest Occurence : "+result);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		highestoccurchar(str);
	}

}
