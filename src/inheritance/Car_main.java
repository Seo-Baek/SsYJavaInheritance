package inheritance;

public class Car_main {

	public static void main(String[] args) {
		
		/*
		 * Sonata 클래스 객체 생성 과정
		 * Sonata 클래스 객체 생성시 JVM이
		 * 우선적으로 Car 부모클래스를 객체 생성 후
		 * Sonata 클래스 객체 생성
		 */
		Sonata son = new Sonata();
		son.model = "소나타";
		son.cc = 2000;
		son.door = 4;
		son.prn();
	}

}
