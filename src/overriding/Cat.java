package overriding;

import overriding.Animal;

public class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("미야옹");
	}
}
