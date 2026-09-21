package Constructor;

class student {
	private String name;
	private int age;

	student() {
		System.out.println(name);
	}
	
	public String toString() {
		return name+":"+age;
	}
}

public class main {
	
	main(String name){
		System.out.println("hii "+name);
	}
	public static void main(String[] args) {
		student s = new student();
		main m=new main("sai");
		System.out.println(s);

	}

}
