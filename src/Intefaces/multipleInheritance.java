package Intefaces;

interface AA {
	default void hello() {
		System.out.println("hello in AA");
	}

	void display();
}

interface BB {
	default void hello() {
		System.out.println("hello in BB");
	}

	void show();
}

class C implements AA, BB {

	@Override
	public void display() {
		System.out.println("Display Method");
	}

	@Override
	public void show() {
		System.out.println("Show Method");
	}

	public void hello() {
		AA.super.hello();
		BB.super.hello();
	}

}

public class multipleInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.show();
		c.hello();
	}
}
