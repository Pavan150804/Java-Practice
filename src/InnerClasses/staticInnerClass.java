package InnerClasses;

class outerr{
	 static class innerr{
		 void print() {
			 System.out.println("hai...");
		 }
		
	}
}
public class staticInnerClass {
	public static void main(String[] args) {
		
		outerr.innerr i=new outerr.innerr();
	      i.print();
	}
}
