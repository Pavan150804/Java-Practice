package Problems;

public class LongestPrefix {
	public static void main(String[] args) {
		String st[]= {"floor","flat","flex","flight","flower","fox"};
		String min=st[0];
		String prefix="";
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
				prefix+=min.charAt(i);
			}
			
		}
		
		if(prefix.length()>0) {
			System.out.println(prefix);
		}
		else {
			System.out.println("Pavan");
		}
	
	}

}
