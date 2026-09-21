package Problems;

public class Hcf {
	public static int hcf(int a,int b) {
		if(b==0) {
			return a;
		}
		return hcf(b,a%b);
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
//		int hcf=0;
//		for(int i=1;i<=a && i<=b ;i++) {
//			if(a%i==0 && b%i==0) {
//				hcf=i;
//			}
//		}
//		
//		System.out.println(hcf);
		
//		while(b!=0) {
//			int temp=b;
//			b=a%b;
//			a=temp;
//		}
//		
//		System.out.println(a);
		
		System.out.println(hcf(a,b));
		
	}

}
