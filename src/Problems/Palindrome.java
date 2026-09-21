package Problems;

public class Palindrome {
   public static void main(String[] args) {
	
	   String st="AMMAA";
	   String s="";
	   for(int i=st.length()-1;i>=0;i--) {
		   s+=st.charAt(i);   
	   }
	   
	   if(st.equals(s)) {
		   System.out.println("Palindrome");
	   }
	   
	   else {
		   System.out.println("Not a Palindrome");
	   }
	   
	   String ss=new String("Pavan");
	   String s1=new String("Pavan");
	   System.out.println(ss.equals(s1));
	   System.out.println(ss==s1);
	   
	   String str="Pavan";
	   String str1="Pavan";
	   System.out.println(str.equals(str1));
	   System.out.println(str==str1);
	   
	   System.out.println(str.equals(s1));
	   System.out.println(str==s1.intern());
}
}
