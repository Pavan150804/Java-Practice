package Constructor;

public class defaultConstructor {
	
	int age;
	String name;
	
	public String toString() {
		return age+":"+name;
	}
   public static void main(String[] args) {
	  defaultConstructor dc=new defaultConstructor();
	  System.out.println(dc);
   }
}
