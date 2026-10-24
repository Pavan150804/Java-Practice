package Problems;

public class octalnum {
	public static void main(String[] args) {
		
//		  int num = 80;
//	        String oct = "";
//	        int rem;
//
//	        while (num > 0) {
//	            rem = num % 8;
//	            oct = rem + oct;
//	            num = num / 8;
//	        }
//
//	        System.out.println("Octal number: " + oct);
//	    }
		
		System.out.println(Integer.toOctalString(17));
		
		   int num1 = 17;
	        int num2 = 12;

	        int carry = 0;
	        int sum = 0;
	        int place = 1;

	        while (num1 > 0 || num2 > 0 || carry > 0) {

	            int rem1 = num1 % 10;
	            int rem2 = num2 % 10;

	            int total = rem1 + rem2 + carry;

	            sum = sum + (total % 8) * place;
	            carry = total / 8;

	            num1 = num1 / 10;
	            num2 = num2 / 10;
	            place = place * 10;
	        }

	        System.out.println("Octal sum: " + sum);
	    }

}
