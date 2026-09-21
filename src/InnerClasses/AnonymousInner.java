package InnerClasses;

interface A{
	public void display();
	void hai();
}

public class AnonymousInner {
	public static void main(String[] args) {
		A a= new A() {		
	        @Override
			public void display() {
				System.out.println("hai..");
		    }

			@Override
			public void hai() {
				System.out.println("hello..");
				
			}
	     };
		a.display();
		a.hai();
		
	}

}
