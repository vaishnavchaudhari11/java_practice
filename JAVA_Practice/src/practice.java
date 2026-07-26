import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practice {
	
	//programming
	
	
	public static void eachcharacteroccurence(String str) {
		
		
		for(int i=0;i<str.length();i++) {
			
			boolean already = false;
			for(int k=0;k<i;k++) {
				
				if(str.charAt(i) == str.charAt(k)) {
					already = true;
					break;
				}
			}
			
			int count =0;
			if(already == false) {
				
			
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		
			
			System.out.println("character :"+str.charAt(i) +" - "+count);
			}
		}
		
	}
	
	
	public static void hashmapcharacteroccurence(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : map.keySet()) {
			System.out.println(ch + "-"+map.get(ch));
		}
	}
	
	
	
	public static String removeduplicatecharacter(String str) {
		
		String result ="";
		for(int i=0;i<str.length();i++) {
			
			
			
			int count = 0;
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j) && i<=j) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	
	public static void sortarrayinascending(int[] arr ) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	
	public static void removeduplicatechar(String str) {
		
		
		String result ="";
		
		for(int i =0;i<str.length();i++) {
			
			int count =0;
			
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					
					count++;
					break;
					
				}
				
				
			}
			
			
			if(count ==0) {
				result += str.charAt(i);
				
			}
		}
		
		System.out.println("Result : "+result);
	}
	
	
	
	public static void characteroccurence(String str) {
		
		for(int  i =0;i<str.length();i++) {
			
			int count = 1;
			boolean repeated = false;
			for(int k=0;k<i;k++) {
				
				if(str.charAt(i) == str.charAt(k)) {
					
					repeated = true;
					break;
				}
			}
			
			
			if(repeated == false) {
				for(int  j =i+1;j<str.length();j++) {
					
					if(str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println("char :"+str.charAt(i) + " -"+count);
			}
			
			
		}
		
		
		
	}
	
	
	public static void repeatingchar(String str) {
		
		for(int  i =0;i<str.length();i++) {
			
			int count =0;
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					
					count ++;
//					System.out.println(str.charAt(i));
//					break;
				}
			}
			
			if(count > 0) {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	
	
	public static void maxoccuringelement(String str) {
		
		
		int max = 0;
		char result = ' ';
		for(int i=0;i<str.length();i++) {
			int count = 1;
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j) ) {
					
					count++;
					
				}
			}
		
		
		
		
		
		if(max < count) {
			max = count;
			result = str.charAt(i);
		}
		}
		System.out.println(result);
	}
	
	
	
	
	
	public static void summar() {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			int sum = 0;
			for(int j =0;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					continue;
				}
				
				
				sum = sum + arr[j];
			}
			arr2[i] = sum;
		}
		
		/*
		for(int x : arr2) {
			System.out.println(x);
		}
		*/
		
		System.out.println(Arrays.toString(arr2));
	}
	
	
	
	
	
	public static void duplicatearr() {
		
		int[] arr = {1,3,3,3,4,5,5,6};
		
		for(int i =0;i<arr.length;i++) {
			
			boolean repeated = false;
			for(int k =0; k<i ;k++) {
				
				if(arr[k] == arr[i]) {
				repeated = true;
				break;
				}
			}
			
			if(repeated) continue;
			
			int count = 1;
			for(int j = i ;j<arr.length;j++) {
				
				if(arr[i] == arr[j] && i!=j) {
					count++;
					
				}
			}
			
			if(count > 1) {
				System.out.println(arr[i] + " "+ count);
			}
		}
	}
	
	
	
	public static void sortarray() {
		
		int[] arr = {17,3,5,8,2};
		int[] arrASC = new int[arr.length];
		int[] arrDESC = new int[arr.length];
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				
//				if(arr[i] < arr[j]) {
//					
//					int temp = arr[i];
//					arrDESC[i] = arrDESC[j];
//					arrDESC[j] = temp;
//				}
			}
		}
		
		for(int asc : arr) {
			System.out.print(asc);
		}
		
		System.out.println("2nd larget :" + arr[arr.length-2]);
		
//		for(int desc : arrDESC) {
//			System.out.print(desc);
//		}
	}
	
	public static void duplicaterem(String str) {
		
		String result ="";
		for(int  i=0;i<str.length();i++) {
			int count =0;
			for(int j =i+1 ;j<str.length();j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					break;
				}
				
				
			}
			if(count == 0) {
				result += str.charAt(i);
			}
			
			
		}
		
		System.out.println(result);
	}
	
	
	
	
	
	public static void commonelementsin2arrays() {
		
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,2,3,6};
		
		
		for(int i=0;i<arr1.length;i++) {
			
			
			boolean repeated = false;
			
			for(int j = 0;j<arr2.length;j++) {
				
				if(arr1[i] == arr2[j]) {
					repeated = true;
				}
			}
			
			if(repeated) {
				System.out.println(arr1[i]);
			}
		}
		
		System.out.println("-----------------");
		
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : arr1) {
			set.add(i);
		}
		
		for(int j : arr2) {
			if(set.contains(j)) {
				System.out.println(j);
			}
		}
	} 
	
	
	public static void rmdup() {
		
		int[] arr = {2,3,4,2,3,7,5,8};
		
		for(int i=0;i<arr.length;i++) {
			
			int count = 0;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					
					count++;
//					break;
				}
			}
			
			if(count ==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter String");
//		String str = sc.nextLine();
//		eachcharacteroccurence(str);
//		hashmapcharacteroccurence(str);
//		
//		String removwe= removeduplicatecharacter(str);
//		System.out.println(removwe);
		
//		int[] arr = {3,1,6,4,8};
//		sortarrayinascending(arr);
		//eachcharacteroccurencehashmap(str);
//		String result = EachCharacterOccurance(str);
//		System.out.println(result);
		
		
//		removeduplicatechar("programming");
//		characteroccurence("programming");
//		repeatingchar("programming");
		//maxoccuringelement("aaaabbbccd");
		
//		summar();
		
//		duplicatearr();
//		sortarray();
//		duplicaterem("hello");
//		commonelementsin2arrays();
		rmdup();
	}

}
