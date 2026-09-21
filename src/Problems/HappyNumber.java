package Problems;

public class HappyNumber {

	public static boolean isHappy(int n) {
		
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			int sq = d * d;
			sum += sq;
			n = n / 10;
		}
			if (sum == 1) 
				return true;
			else if (sum == 0) 
				return false;
			else if (sum >= 2 && sum <= 9) 
				return false; 
			else 
				return isHappy(sum);

		
	}

	public static void main(String[] args) {
		System.out.println(isHappy(31)?"Happy":"UnHappy");

	}

}
