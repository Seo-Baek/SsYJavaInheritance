package AccessOne;

public class Sub2 {

	public static void main(String[] args) {
		
		Super sup2 = new Super();
		
		System.out.println("num3 ==> " + sup2.num3);
		//protected는 동일 패키지, 상속관계면 접근 가능!
	}

}
