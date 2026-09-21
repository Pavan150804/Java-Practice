package Problems;

public class fibnonciRecursion {
//	public static void fib(int a,int b,int c) {
//		if(c==10) {
//			return;
//		}
//		System.out.println(a);
//		fib(b,a+b,c+1);
//		
//	}
	
	public static int printfib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return printfib(n-1)+printfib(n-2);
	}
	public static void main(String[] args) {
//		int a=0;
//		int b=1;
//		int c=0;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(a);
//			c=a+b;
//			a=b;
//			b=c;
//		}
		
//		fib(0,1,0);
		
		for(int i=0;i<5;i++) {
			System.out.println(printfib(i));
		}
	}

}
