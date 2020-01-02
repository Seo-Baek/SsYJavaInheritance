package overriding;

import overriding.Animal;

public class Frog extends Animal {

	  @Override
	void sound() {
		  System.out.println("개굴개굴");
	  }
}
