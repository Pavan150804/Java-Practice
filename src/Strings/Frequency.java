package Strings;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class counter {
	public void countCharacter(String str) {
		str=str.toLowerCase();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		char[] ch = str.toCharArray();

		for (Character ch1 : ch) {
//			if (hmap.containsKey(ch1)) {
//				hmap.put(ch1, hmap.get(ch1) + 1);
//			} else {
//				hmap.put(ch1, 1);
//			}
			
			hmap.put(ch1,hmap.getOrDefault(ch1,0)+1);
		}
		
//		System.out.println(hmap);
		
//		Set<Character> key=hmap.keySet();
//		for (Character set: key) {
//			System.out.println("Character: " + set + "--> " +hmap.get(set) +"times");
//		}
		
		for( Map.Entry <Character,Integer> kv : hmap.entrySet()) {
			System.out.println(kv);
		}
	}
}

	public class Frequency {
	
	public static void main(String[] args) {
		counter c = new counter();
		c.countCharacter("PavanManikanta");

	
	}

}

