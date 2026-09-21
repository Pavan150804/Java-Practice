package Intefaces;

interface phone{
	private static void samsung() {
		System.out.println("s24 ultra");
	}
//	default void print() {
//		samsung();
//	}
	
	public static void print() {
		samsung();
	}
}
class Android implements phone{
	
	
	
}
public class privateMethod {
	public static void main(String[] args) {
		phone ph=new Android();
//		ph.print();
		phone.print();
	}

}
