package Problems;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "programming";
		
		boolean b[]=new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					b[j]=true;
				}
			}
			
			if(!b[i]) {
				System.out.println(str.charAt(i));
			}
		}
		    
	     

	        LinkedList<Character> list = new LinkedList<>();

	        for (char ch : str.toCharArray()) {
	            if (!list.contains(ch)) {
	                list.add(ch);
	            }
	        }

	        for (char ch : list) {
	            System.out.print(ch);
	        }
	        
	        System.out.println();
	        
	        String empty="";
	        
	        for(char ch:str.toCharArray()) {
        	    if(!empty.contains(ch+"")) {
        	    	   empty+=ch;
        	     }   
            }
	        System.out.println(empty);
	        
		

		        HashSet<Character> set = new HashSet<>();
		        String result = "";

		        for (char ch : str.toCharArray()) {
		            if (set.add(ch)) {
		                result += ch;
		            }
		        }

		        System.out.println(result);
		    
		
	}
}

