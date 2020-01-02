package polymorphism;

public class Animal_main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sound();
		
		Cat cat = new Cat();
		
		Animal animal1 = cat;
		
	}

}
