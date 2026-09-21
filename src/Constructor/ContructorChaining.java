package Constructor;

public class ContructorChaining {

	public ContructorChaining() {
		this(20);
       System.out.println("No Param");
	}

	public ContructorChaining(int a) {
		this("Hai..");
		System.out.println(a);

	}

	public ContructorChaining(String name) {
		System.out.println(name);

	}

	public static void main(String[] args) {
      ContructorChaining c=new  ContructorChaining();
	}
}
