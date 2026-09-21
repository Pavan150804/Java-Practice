package Oops;

//class Car{
//	private int speed;
//	private String name;
//	
//	public void setSpeed(int speed) {
//		if(speed>0) {
//			this.speed=speed;
//		}
//		else {
//			System.out.print("Invalid Speed");
//			this.speed=60;
//		}
//	}
//	
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public int getSpeed() {
//		return speed;
//	}
//	
//}
//public class Encapsulation {
//	
//
//	public static void main(String[] args) {
//		
//		Car c=new Car();
//		c.setSpeed(-10);
//		System.out.println(c.getSpeed());
//		
//	}
//
//}


class Car {

    private int speed;
    private String name;

    // Constructor
    public Car(int speed, String name) {

        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid Speed");
            this.speed = 60;
        }

        this.name = name;
    }

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
   
}

public class Encapsulation {

    public static void main(String[] args) {

        Car c1 = new Car(120, "BMW");
        c1.setName("Ferari");
        System.out.println(c1.getName());
        System.out.println(c1.getSpeed());

        Car c2 = new Car(-50, "Audi");
        System.out.println(c2.getName());
        System.out.println(c2.getSpeed());
    }
}

