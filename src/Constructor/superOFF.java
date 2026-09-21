package Constructor;

class parent {
	public parent(int a) {
		System.out.println("Parent Parameterized Constructor");
	}

	public parent() {
		this(10);
		System.out.println("Parent No param Constructor");
	}
}

class child extends parent {
	public child(String name) {
		this(10,"Sai");
		System.out.println("child Param Constructor");
	}
	public child(int a,String b) {
		this();
		System.out.println("int String param constructor");
	}
	public child() {
		System.out.println("child constructor");
	}

}

public class superOFF {
	public static void main(String[] args) {

		System.out.println("Main starts");
		child c = new child("Pavan");
		System.out.println("Main ends");

	}
}
