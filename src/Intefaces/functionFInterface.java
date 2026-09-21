package Intefaces;

import java.util.function.Function;

public class functionFInterface {
   public static void main(String[] args) {
	Function<Integer,String> f=new Function<Integer,String>(){
		public String apply(Integer t) {
			return t+"!!";
		}
	};
	
	System.out.println(f.apply(100));
	
	Function<Integer,Integer> f1=t->t*2;
	System.out.println(f1.apply(10));
 }
}
