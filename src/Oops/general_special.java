package Oops;

abstract  class Employee{
	abstract void role();
	abstract void salary();
}

class hr extends Employee{

	@Override
	void role() {
		System.out.println("hr");
		
	}

	@Override
	void salary() {
		System.out.println("hr salary..");
		
	}
	
}

class tl extends Employee{

	@Override
	void role() {
		System.out.println("tl");
		
	}

	@Override
	void salary() {
		System.out.println("tl salary");
		
	}
	
}


public class general_special {
	
	public static void display(Employee e) {
		e.role();
		e.salary();	
	}
	public static void main(String[] args) {
		display(new hr());
		display(new tl());
	}

}
