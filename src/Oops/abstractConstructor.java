package Oops;

abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class abstractConstructor {
	public static void main(String[] args) {
		Animal d = new Dog();
        d.sound();
	}

}
