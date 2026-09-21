package Intefaces;

import java.util.function.Predicate;

public class predicateFInterface {
  public static void main(String[] args) {
	Predicate<String> p=new Predicate<String>() {
		 public boolean test(String s) {
			 return s.length()==4;
		 }
	};
	
	System.out.println(p.test("saii"));
	
	
	Predicate<Integer> p1=t-> t>=0;
	System.out.println(p1.test(1)?"Positive":"negative");
}
}
