package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicates {
	
	 public void duplicactes(String str) {
		 str=str.toLowerCase();
		   
		 HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		 
		 for(Character ch:str.toCharArray()) {
			 
			 map.put(ch, map.getOrDefault(ch, 0)+1);
			 
		 }
		 
//		 System.out.println(map);
		 
		   for(Character ch:map.keySet()){
			   if(map.get(ch)>1) {
				   System.out.println("character:  " + ch + "----> " + map.get(ch) +"  times");
			   }
		   }
		 
//		 HashSet<Character> h1=new HashSet<Character>();
//		 HashSet<Character> h2=new HashSet<Character>();
//		 for(Character ch:str.toCharArray()) {
//			 if(!h1.add(ch)) {
//				 h2.add(ch);
//				 
//			 }
//     	 }
		 
//		 System.out.println(h2);
		   
	 }
	public static void main(String[] args) {
		
		FindDuplicates fd= new FindDuplicates();
		fd.duplicactes("Haii");
	}

}
