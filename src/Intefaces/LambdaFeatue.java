package Intefaces;

interface A1	{
//	void greet();
	int power(int a,int b);
}

public class LambdaFeatue {
	public static void main(String[] args) {
//		A1 a =new A1() {
//
//			@Override
//			public void greet() {
//				System.out.println("hello...");
//				
//			}
//			
//		};
		
//		A1 a1=()->System.out.println("hello..");
//		a1.greet();
		
		A1 a2=(t1,t2)->Math.powExact(t1, t2);
		System.out.println(a2.power(2, 2));
	}

}
