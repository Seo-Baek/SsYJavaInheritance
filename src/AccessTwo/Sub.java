package AccessTwo;

import AccessOne.Super;	//다른패키지라 import 됨!

public class Sub extends Super {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
		//System.out.println("num1 ==> " + sub.num1);
		//private은 해당 클래스에서만 접근 가능!
		
		//System.out.println("num2 ==> " + sub.num2);
		//default는 해당 패키지 내에서만 접근 가능!
		//다른 패키지의 상속관계에 있는 멤버라도 접근이 불가능.
		
		System.out.println("num3 ==> " + sub.num3);
		//protected는 동일패키지 뿐 아니라
		//다른 패키지더라도 상속관계면 접근 가능!
		
		System.out.println("num4 ==> " + sub.num4);
		//public은 모든 패키지에서 접근이 가능하다
		
	}

}
