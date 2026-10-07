package Problems;

import java.util.HashSet;
import java.util.LinkedList;

public class duplicates {
	public static void main(String[] args) {
		String str = "programming";
		
		boolean b[]=new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					b[i]=true;
				}
			}
			
			if(b[i]) {
				System.out.println(str.charAt(i));
			}
		}
		
		

	        HashSet<Character> seen = new HashSet<>();
	        HashSet<Character> duplicates = new HashSet<>();

	        for (char ch : str.toCharArray()) {
	            if (!seen.add(ch)) {
	                duplicates.add(ch);
	            }
	        }

	        System.out.println(duplicates);
//	        System.out.println(seen);
	        
             
	        LinkedList<Character> seenn = new LinkedList<>();
	        LinkedList<Character> duplicatess = new LinkedList<>();

	        for (char ch : str.toCharArray()) {

	            if (seenn.contains(ch)) {
	                if (!duplicatess.contains(ch)) {
	                    duplicatess.add(ch);
	                }
	            } else {
	                seenn.add(ch);
	            }
	        }

	        System.out.println(duplicatess);
	    
		
	}
}
