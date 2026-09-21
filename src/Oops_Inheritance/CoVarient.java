package Oops_Inheritance;

class Animal {

}

class Dog extends Animal {

}

class Parrent {

	Animal getAnimal() {
		System.out.println("Parent Method");
		return new Animal();
	}
}

class Chiild extends Parrent {

	@Override
	Dog getAnimal() {
		System.out.println("Child Method");
		return new Dog();
	}

}

public class CoVarient {
	public static void main(String[] args) {
		
		Parrent p=new Chiild();
		Animal a=p.getAnimal();

	}

}
