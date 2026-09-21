package Problems;

public class Lcm {
	public static int lcm(int a, int b) {
		if (b == 0) {
			return a;
		}

		return lcm(b, a % b);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		int hcf=1;
//		for(int i=1;i<=Math.min(a, b);i++) {
//			if(a%i==0 && b%i==0) {
//				hcf=i;
//			}
//		}
//		int lcm=a*b/hcf;
//		System.out.println(lcm);

		int hcf = lcm(a, b);
		int lcm = a * b / hcf;
		System.out.println(lcm);

		int lcm1 = 0;
         int max=Math.max(a, b);
//		for (int i = Math.max(a, b); i <= a * b; i++) {
         for(int i=max;i<=a*b;i+=max) {
			if (i % a == 0 && i % a == 0) {
				lcm1 = i;
				break;
			}
		}

		System.out.println(lcm1);
	}

}
