package Problems;

public class factorialRecursion {
	
	public static int fact(int a) {
		if(a==1) {
			return 1;
		}
		 return a* fact(a-1);
	}
	public static void main(String[] args) {
		 System.out.println(fact(5));
	}

}
