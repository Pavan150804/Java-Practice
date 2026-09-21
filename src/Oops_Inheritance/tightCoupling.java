package Oops_Inheritance;

class Engine{
	public void start() {
		System.out.println("Engine Started..");
	}
}
class car{
	Engine e=new Engine();
	public void run() {
		e.start();
		System.out.println("Car Running..");
	}
	
}
public class tightCoupling {
	public static void main(String[] args) {
		car cc=new car();
		cc.run();
	}

}
