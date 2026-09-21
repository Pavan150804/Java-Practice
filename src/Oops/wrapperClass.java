package Oops;

public class wrapperClass {
	public static void main(String[] args) {
		
		/**int a = 100;
		// Boxing
		// 1.manual
		Integer i = new Integer(a); // deprecated
		Integer i1 = Integer.valueOf(a);  //valueOf is static method
		System.out.println(i1);
		// 2.Automatic
		Integer i2 = a;
		System.out.println(i2);

		//Unboxing
		Integer k = 20;
		// 1.manual
		int k1 = k.intValue(); //intValue is non static method
		System.out.println(k1); 
		// automatic
		int k2 = k;
		System.out.println(k2);
		
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toHexString(47));
		
		**/
		
		String s="10";
		
		int i =Integer.valueOf(s);
		System.out.println(i);
		
		int i2=Integer.parseInt(s);
		System.out.println(i2);
		
		String b="true";
		System.out.println(Boolean.valueOf(b));
		System.out.println(Boolean.parseBoolean(b));

	}

}
