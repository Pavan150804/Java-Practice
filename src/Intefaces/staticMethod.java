package Intefaces;

interface s{
	public static void hai() {
		System.out.println("hai..");
	}
}
class G implements s{
	
}
public class staticMethod {
	public static void main(String[] args) {
		 s.hai();
	}

}
