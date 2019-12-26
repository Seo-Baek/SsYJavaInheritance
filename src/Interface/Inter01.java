package Interface;

/*
 * 인터페이스(Interface) ?
 * 	1. 완벽한 추상화를 제공한다.
 * 	2. 클래스와 클래스 사이의 중계적 역할을 하는 서비스를 제공함.
 * 		=> 객체와 객체의 중간에 놓이는 통신 채널.
 * 	3. 모든 메소드가 추상화(추상메소드)이다.
 * 	4. 프로젝트 진행 시 표준 규약을 따른다.
 * 		=> 추상클래스 보다 더 많이 사용된다.
 * 	5. 인터페이스는 상수와 추상메소드만으로 구성된다.
 * 	6. 모든 변수는 상수로 사용된다.
 * 		예) public static final 로 인식.
 * 	7. 모든 메소드는 추상메소드로 사용된다.
 * 		예) public abstract 로 인식.
 * 	8. 인터페이스는 객체 생성이 불가능.
 * 	9. 자식클래스로 상속하여 자식으로 객체 생성
 * 		=> 인터페이스의 추상메소드는 반드시 재정의(강제성)
 * 	10. 인터페이스는 다중 상속을 제공한다.
 * 	11. class -> interface 키워드 사용
 * 		extends -> implements 키워드 사용
 */

public interface Inter01 {	// 11. class -> interface 키워드 사용
	
	// 6. 모든 변수는 상수로 쓰인다.
	int num = 100;		//멤버변수
	
	// 7. 모든 메소드는 추상메소드로 쓰인다.
	void display1();	//추상메소드
	void display2();	//추상메소드
}