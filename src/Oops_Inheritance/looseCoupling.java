package Oops_Inheritance;

interface engine{
	void start();
}

class petrolEngine implements engine{

	@Override
	public void start() {
		System.out.println("Petrol Engine");
		
	}
	
}

class dieselEngine implements engine{

	@Override
	public void start() {
		System.out.println("Diesel Engine");
	}
	
}

class Carr{
	engine E;
	
	Carr(engine w){
		this.E=w;	
	}
	
	void drive() {
		E.start();
	}
	
	
}

public class looseCoupling {
	public static void main(String[] args) {
		Carr c=new Carr(new petrolEngine());
		Carr c1=new Carr(new dieselEngine());
		c.drive();
		c1.drive();
	}

}
