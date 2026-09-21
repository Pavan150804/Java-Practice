package Intefaces;
import java.util.function.*;
public class supplierFInterface {
	public static void main(String[] args) {
		Supplier<String> s=new Supplier<String>() {

			@Override
			public String get() {
				return "Pavan";
			}
			
		};
		System.out.println(s.get());
		
		Supplier<Integer> i=()->100;
		System.out.println(i.get());
		
	}

}
