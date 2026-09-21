package Oops;


abstract  class AA{ 
	
	abstract void bike();
	
}
class BB extends AA{
	
	public void bike() {
		System.out.println("bike method");
	}
	
}

class Helper{
	public static AA getObject() {
		return new BB();
	}
	
	public AA getObject1() {
		return new BB();
	}
}
public class abstraction {
 public static void main(String[] args) {
	Helper.getObject().bike();
	
	Helper h=new Helper();
	h.getObject1().bike();;
}
}
