package Oops;

public class finalKeyword {
//	final public static void hai() {
//		System.out.println("hai...");
//	}
//	final static int b=20;
//	final static int c;
//	static {
//		c=30;
//	}
	
	final int d=20;
	final int e;
	{
		e=100;
	}
	final int f;
	public finalKeyword(int a) {
		 this.f=a;
	}
	public static void main(String[] args) {
//		final int a = 20;
//		System.out.println(a);
//		hai();
//		
		
//		int c;
//		System.out.println(c);error
		
//		final String name="Pavan";
//		final String n;
//		n="sai";
		 
//		System.out.println(c+" "+b);
		
		finalKeyword f=new finalKeyword(10);
		System.out.println(f.d);
		System.out.println(f.e);
		System.out.println(f.f);
		finalKeyword f1=new finalKeyword(40);
		System.out.println(f1.e);
		System.out.println(f1.f);
	}

}
