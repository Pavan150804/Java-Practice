package InnerClasses;

class outer{
	private String name="Pavan";
	class inner{
		void show() {
			System.out.println("hai...."+name);
		}
	}
}
public class regularInnerClass {
	public static void main(String[] args) {
		
		outer o=new outer();
		outer.inner i=o.new inner();
		i.show();
	}

}
