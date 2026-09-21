package Problems;

//import java.util.Arrays;

public class LongestSuffix {
	public static void main(String[] args) {
		String st[]= {"suresh","naresh","vignesh","rajesh"};
		
		for(int i=0;i<st.length;i++) {
			st[i]=new StringBuffer(st[i]).reverse().toString();
		}
//		System.out.println(Arrays.toString(s));
		
		String min=st[0];
		String suffix="";
		for(int i=0;i<st.length;i++) {
			if(min.length()>st[i].length()) {
				min=st[i];
			}
		}
		
		for(int i=0;i<min.length();i++) {
			int count=0;
			for(int j=0;j<st.length;j++) {
				if(min.charAt(i)==st[j].charAt(i)) {
					count++;
				}
			}
			
			if(count==st.length) {
				suffix+=min.charAt(i);
			}
			
		}
		
		if(suffix.length()>0) {
			System.out.println(new StringBuffer(suffix).reverse().toString());
		}
		else {
			System.out.println("Pavan");
		}
	}

}
