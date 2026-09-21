package Oops;

class A{
	static {
		System.out.println("static in A");
	}
	
	public static void hai() {
		System.out.println("haii");
	}
}
public class StaticBlock {
	
	static { //lock
		System.out.println("static-1");
	}
	static {
		System.out.println("static-2");
	}
	public static void main(String[] args) { //main gate
		System.out.println("Main Starts");
		A.hai();
		A.hai();
		System.out.println("Main Ends");
	}

}
