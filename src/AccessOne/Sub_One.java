package AccessOne;

public class Sub_One extends Super  {

	public static void main(String[] args) {
		
		Sub_One sub = new Sub_One();
		
		//System.out.println("num1 ==> " + sub.num1);
		//private은 해당 클래스에서만 접근 가능!
		
		System.out.println("num2 ==> " + sub.num2);
		//default는 해당 패키지 내에서만 접근 가능!
		
		System.out.println("num3 ==> " + sub.num3);
		//protected는 동일 패키지, 상속관계면 접근 가능!
		
		System.out.println("num4 ==> " + sub.num4);
		//public은 모든 패키지에서 접근이 가능하다
		
	}

}
