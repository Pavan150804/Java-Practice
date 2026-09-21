package Constructor;

class Parent{
	public Parent() {
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	
//	public Child() {
//		System.out.println("Child Constructor");
//	}
	
}

public class constrructorInheritance {
   public static void main(String[] args) {
	   System.out.println("Main starts");
	   Child ch=new Child();
	   System.out.println("Main ends");
			   
	
}
}
