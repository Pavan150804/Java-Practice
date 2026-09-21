package Oops;
abstract class Vehicle {

    abstract public void start();
}

class Car1 extends Vehicle {

    @Override
   public void start() {
        System.out.println("Car Starts");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Starts");
    }
}
public class abstractClass {
	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.start();
		
	}

}
