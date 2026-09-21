package Problems;

public class ReverseNumber {
	
	public static int rev(int n,int revs) {
		if(n==0) {
			return revs;
		}
		return rev(n/10,revs*10+n%10);
	}
	public static void main(String[] args) {
//		int n=123;
//		int rev=0;
//		while(n!=0) {
//			int temp=n%10;
//			rev=rev*10+temp;
//			n=n/10;
//		}
//		System.out.println(rev);
		
		System.out.println(rev(123,0));
	}

}
