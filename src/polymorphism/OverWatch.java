package polymorphism;

/*
 * 다형성 (Polymorphism) ?
 * 	- 객체 지향 프로그램 4대 특징 중 하나.
 * 	- 다형성의 사전적 의미 : 같은 종의 생물이지만 모습이나 특징이
 * 						고유한 성질을 가지고 있는 것을 말한다.
 * 	- 여러가지 모습으로 해석될 수 있는 형태를 의미함.
 * 	- 하나의 사물(객체)를 다양한 타입으로 선언하고 이용할 수 있는 성질.
 * 	- 조상타입으로 자손타입의 객체를 다룰 수 있는 것이 다형성의 특징이다.
 * 		예) 부모클래스의 참조변수로 자식의 멤버를 호출
 */

public interface OverWatch {
	
	//추상메소드
	void name();
	void leftClick();
	void rightClick();
	void shiftButton();
	void eButton();
	void qButton();
	
}
