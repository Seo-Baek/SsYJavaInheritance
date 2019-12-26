package Abstract;

public class Abstract_main {

	public static void main(String[] args) {

		// 추상클래스는 객체 생성이 안된다.
		//SuperA sup = new SuperA() 
		
		SubA sub = new SubA();
		sub.num1 = 40;
		System.out.println("num1 ==> " + sub.num1);
		System.out.println("calc() 메소드 호출 ==> " + sub.calc());
		sub.prn();		//추상메소드를 재정의한 메소드
		
		
	}

}
