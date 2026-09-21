package Oops_Inheritance;

class parent {
	public void bike() {
		System.out.println("red color");
	}

	public void car() {
		System.out.println("Yellow car..");
	}
}

class child extends parent {
	@Override
	public void bike() {
		System.out.println("black color");

	}

	public void cycle() {
		System.out.println("cycle...");
	}

}

public class downCasting {
	public static void main(String[] args) {
		parent up = new child();
		if (up instanceof child) {
			child d = (child) up;
			d.bike();
			d.car();
			d.cycle();
		}

	}
}
