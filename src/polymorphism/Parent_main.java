package polymorphism;

public class Parent_main {

	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = child;
		
		//Child child2 = new Parent();오류! 부모가 더 크다
		
		parent.method1();	//Parent의 메소드 값
		parent.method2();	//Child의 재정의된 메소드 값
		
		//parent.method3(); Parent class에 없어서 호출불가.
		
	}

}
