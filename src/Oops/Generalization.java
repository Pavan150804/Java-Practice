package Oops;

class Animal2 {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog2 extends Animal2 {

}

class Cat2 extends Animal2 {

}
public class Generalization {
	public static void main(String[] args) {
		Cat2 c=new Cat2();
		c.eat();
		Dog2 d=new Dog2();
		d.eat();
	}

}
