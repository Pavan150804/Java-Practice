package Problems;

public class NoOfPalindromes {
	public static void main(String[] args) {
		String s="nitin";
		String lp="";
		
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {	
//				if(s.substring(i, j).length()>=3) {
//					if(isPalindrome(s.substring(i,j))) {
//						System.out.println(s.substring(i,j));
//					}	
//				}
				
				String sub=s.substring(i,j);
				  boolean palindrome = true;
			        
		          int start = 0;
		          int end = sub.length() - 1;

		          while (start < end) {

		              if (sub.charAt(start) != sub.charAt(end)) {
		                  palindrome = false;
		                  break;
		              }

		              start++;
		              end--;
		          }
		          if(sub.length()>2 && palindrome) {
//		      		if(  lp.length()>sub.length()  ||lp.equals("")) {
//		      			lp=sub;
//		      		}
		        	  
		        	  if(lp.equals("")||sub.length()<lp.length()) {
		        		  lp=sub;
		        	  }
		      	}
				
			}
			
		}
		
		if(lp.length()>0) {
			System.out.println(lp);
		}
		else {
             System.out.print("No Palindrome");
		}
	}
	
}	
		
	
//	public static boolean isPalindrome(String s) {
//		return new StringBuilder(s).reverse().toString().equals(s);
//		
//	}
	
//	}
//}
// 