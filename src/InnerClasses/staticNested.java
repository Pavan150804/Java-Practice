package InnerClasses;

class outer1{
	 class inner1{
		static void hai() {
			System.out.println("hai...");
		}
	}
}
public class staticNested {
	public static void main(String[] args) {
		outer1.inner1.hai();
	}

}
