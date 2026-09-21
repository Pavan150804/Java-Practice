package Intefaces;

import java.util.function.Consumer;

//class Con implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//	
//}
public class consumerFinterface {
	public static void main(String[] args) {
//		Con con=new Con();
//		con.accept(100);
		
		Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		c.accept(200);
		
		Consumer<Integer> c1=t->System.out.println(t);;
		c1.accept(200);
	}

}
