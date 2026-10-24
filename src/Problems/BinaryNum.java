package Problems;
import java.util.Scanner;
public class BinaryNum {
	public static void main(String[] args) {

//		int num=10;
//		String bin="";
//		int rem;
//		
//		while(num>0) {
//			rem=num%2;
//			bin=rem+bin;
//			num=num/2;
//			
//		}
//		
//		System.out.println(bin);

		
//		        Scanner sc = new Scanner(System.in);
//
//		        System.out.print("Enter a decimal number: ");
//		        int num = sc.nextInt();
//
//		        int[] binary = new int[32];
//		        int i = 0;
//
//		        while (num > 0) {
//		            binary[i] = num % 2;
//		            num = num / 2;
//		            i++;
//		        }
//
//		        System.out.print("Binary number: ");
//
//		        for (int j = i-1; j >= 0; j--) {
//		            System.out.print(binary[j]);
//		        }
//
//		        sc.close();
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        int num = sc.nextInt();
	        int binary = 0;
	        int rem;
	        int place = 1;

	        while (num > 0) {
	            rem = num % 2;
	            binary = binary + rem * place;
	            num = num / 2;
	            place = place * 10;
	        }

	        System.out.println("Binary number: " + binary);

	        sc.close();
		   
		

//		int num1 = 1010;
//		int num2 = 0110;
//
//		int carry = 0;
//		int sum = 0;
//		int place = 1;
//
//		while (num1 > 0 || num2 > 0 || carry > 0) {
//
//			int rem1 = num1 % 10;
//			int rem2 = num2 % 10;
//
//			int total = rem1 + rem2 + carry;
//
//			sum = sum + (total % 2) * place;
//			carry = total / 2;
//
//			num1 = num1 / 10;
//			num2 = num2 / 10;
//			place = place * 10;
//
//		}
//
//		System.out.println(sum);
		
	}

}
