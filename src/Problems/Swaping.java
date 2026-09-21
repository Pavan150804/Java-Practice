package Problems;

public class Swaping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("before a:"+a);
		System.out.println("before b:"+b);
		
//		int temp=a;
//		a=b;
//		b=temp;
		
		a=a+b; //a=30
		b=a-b;  //b=10
		a=a-b; //a=20
		
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;
		
		
		System.out.println("AFter a:"+a);
		System.out.println("After b:"+b);
		
	}

}
