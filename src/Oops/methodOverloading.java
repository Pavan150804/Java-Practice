package Oops;

class Demo {

//    void show(int a) {
//        System.out.println("Exact Match");
//    }

//    void show(long a) {
//        System.out.println("Widening");
//    }

    void show(Integer a) {
        System.out.println("Boxing");
    }

    void show(int... a) {
        System.out.println("Varargs");
    }
     void show(byte a) {
    	   System.out.println("byte..");
    }
}
public class methodOverloading {
	public static void main(String[] args) {
		
		Demo d=new Demo();
//		d.show(10);// Exact match
//		d.show(20); // Widening
//		d.show(100); //boxing
//		d.show(10,20,30); //varsrgs
		
		d.show((byte)10);
		
		
		
	}

}
