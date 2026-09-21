package Oops_Inheritance;

class Parents{
	public void bike() {
		System.out.println("red color");
	}
	public void car() {
		System.out.println("Yellow car..");
	}
}
class Childs extends Parents{
	@Override
	public void bike() {
		System.out.println("black color");
		
	}
	public void cycle() {
		System.out.println("cycle...");
	}
	
}

public class upcasting {
	public static void main(String[] args) {
		Parents p=new Childs();
		p.bike();
		p.car();
		
	}

}
