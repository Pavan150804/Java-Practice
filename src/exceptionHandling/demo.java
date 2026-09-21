package exceptionHandling;

public class demo {
	public static void main(String[] args) {
		System.out.println("main Method start");
		try {
			System.out.println(23/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("main Method End");
	}

}
