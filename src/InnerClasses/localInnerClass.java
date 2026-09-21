package InnerClasses;

class out {
	public static void hai() {
		class inn {
			public void shown() {
				System.out.println("hai..");
			}
			public static void shown1() {
				System.out.println("hello..");
			}
		}

		inn i = new inn();
		i.shown();
		inn.shown1();
	}

}

public class localInnerClass {
	public static void main(String[] args) {

		out o = new out();
		o.hai();
		out.hai();

	}

}
