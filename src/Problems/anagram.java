package Problems;

//public class anagram {
//
//	    public static void main(String[] args) {
//	        String s1 = "listen";
//	        String s2 = "silent";
//
//	        char[] a = s1.toCharArray();
//	        char[] b = s2.toCharArray();
//
//	        java.util.Arrays.sort(a);
//	        java.util.Arrays.sort(b);
//
//	        if (java.util.Arrays.equals(a, b)) {
//	            System.out.println("Anagram");
//	        } else {
//	            System.out.println("Not Anagram");
//	        }
//	    }
//	
//}

public class anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
