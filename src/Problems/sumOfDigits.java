package Problems;

public class sumOfDigits {
	
	public static int sum(int n) {
		 if(n==0) {
			 return 0;
		 }
		int temp=n%10;
	    n=n/10;
		return temp+sum(n);
		
	}
	public static void main(String[] args) {
//		int n=123;
//		int sum=0;
//		while(n!=0) {
//			int temp=n%10;
//			sum+=temp;
//			n=n/10;
//		}
//		System.out.println(sum);
		
		System.out.println(sum(123));
	}

}
