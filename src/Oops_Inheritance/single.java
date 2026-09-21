package Oops_Inheritance;


class Parent{
	public void bike() {
		System.out.println("red color");
	}
	public void car() {
		System.out.println("Yellow car..");
	}
}
class Child extends Parent{
	@Override
	public void bike() {
		System.out.println("black color");
		
	}
	
}
public class single {

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.bike();
		ch.car();
				
		
	}
}
