package Intefaces;


interface A{
	public abstract void hai() ;
}
class B implements A{

	@Override
	public void hai() {
		
	  System.out.println("hai....");
	}
	
}

public class demo {
    public static void main(String[] args) {
    	
    	A a=new B();
    	a.hai();
		
	}
}
