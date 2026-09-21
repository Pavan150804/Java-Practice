package Oops;

class B{
	static {
		System.out.println("static in B");
	}
	{
		System.out.println("Non static in B");
	}
	public B(){
		System.out.println("B constructor");
	}
}
public class nonStaticBlock {
	static { //lock
		System.out.println("static-1");
	}
	
	{
		System.out.println("Non static");
	}
	public nonStaticBlock() {
		System.out.println("constrctor");
	}
	public static void main(String[] args) {
		new nonStaticBlock();
		new nonStaticBlock();
		new B();
	}

}
