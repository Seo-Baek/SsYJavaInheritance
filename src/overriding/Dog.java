package overriding;

import overriding.Animal;

public class Dog extends Animal {


	// 메소드 재정의 (method overriding)
	@Override
	void sound() {
		System.out.println("멍멍멍");
	}
}
