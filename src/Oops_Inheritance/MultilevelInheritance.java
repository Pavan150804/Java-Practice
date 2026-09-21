package Oops_Inheritance;
class Animal1{

    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog1 extends Animal1 {

    void bark() {
        System.out.println("Dog is Barking");
    }
}

class Puppy extends Dog1 {

    void weep() {
        System.out.println("Puppy is Weeping");
    }
}


public class MultilevelInheritance {
	public static void main(String[] args) {
		Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
	}

}
