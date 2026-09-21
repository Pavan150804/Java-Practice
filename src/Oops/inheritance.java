package Oops;

class parent{
	public void start() {
		System.out.println("started...");
	}
	public void stop() {
		System.out.println("stopped...");
	}
}
class child extends parent{
	@Override
	public void start() {
		System.out.println("child started...");
	}
	 
	public void hai() {
		System.out.println("hai..");
	}
}

public class inheritance {
	public static void main(String[] args) {
//		child c=new child();
//		c.start();
		
		parent p =new child(); // upcasting
		p.start();
		
		
		if(p instanceof child) {
			child ch=(child) p;   // downcasting
			ch.hai();
		}
		else {
			System.out.println("Downcasting not possible");
		}
		
	}

}
