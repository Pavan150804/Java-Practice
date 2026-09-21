package Problems;

public class SubString {
  public static void main(String[] args) {
	String s="abcd";
	for (int i=0;i<=s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
//			System.out.println(s.substring(i,j));
			
			if(s.substring(i,j).length()==3) {
				System.out.println(s.substring(i,j));
			}
		}
		
	}
}
}
