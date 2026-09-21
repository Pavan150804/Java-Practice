package Oops;

class Ani {

    void eat() {
        System.out.println("Eating");
    }
}

class Dogs extends Ani {

    void bark() {
        System.out.println("Dog Barks");
    }
}

class Cats extends Ani {

    void meow() {
        System.out.println("Cat Meows");
    }
}
public class specialization {
	public static void main(String[] args) {
		Cats c=new Cats();
		c.eat();
		c.meow();
	}

}
