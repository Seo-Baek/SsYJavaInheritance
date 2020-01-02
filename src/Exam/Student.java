package Exam;

/*
 * 클래스의 관계
 * 	1. 상속 관계
 * 		- is a 관계
 * 		  예) 원은 도형이다(Circle is a Shape)
 * 		- 형식)
 * 			class Circle(자식) extends Shape(부모) {  }
 * 	2. 포함 관계
 * 		- has a 관계,	보통 객체 간 협업을 포함관계라고 한다.
 * 		  예) 원은 점을 포함한다.(Circle has a Point)
 * 		- 형식)
 * 			class Circle {
 * 				Point p;(멤버로 가진다)
 * 			}
 */

public class Student {

	//멤버변수
	String studentName;		//학생 이름
	int money;				//학생 교통카드 잔액
	
	public Student() {  }	//기본생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//객체 간 협업
	public void takeBus(Bus bus) {	
		bus.take(1200);
		this.money -= 1200;
	}
	public void takeSubway(Subway sub) {
		sub.take(1250);
		this.money -= 1250;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은" + money + "원입니다.");
		
	}
}
