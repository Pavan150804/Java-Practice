package Intefaces;

interface prototype{
	default void speedometer() {
		System.out.println("anaalog");
	}
}
class Bike1 implements prototype{
	
}
class Bike2 implements prototype{
	public void speedometer(){
		System.out.println("digital");
	}
}
public class defaultMethod {
	public static void main(String[] args) {
		
		prototype p=new Bike1();
		p.speedometer();
		
		prototype p1=new Bike2();
		p1.speedometer();
		
	}

}
