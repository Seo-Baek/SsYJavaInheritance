package Exam;

public class Bus {

	// 멤버변수
	int busNumber;			//버스노선번호
	int passengerCount;		//승객 수
	int money;				//버스 회사의 수입
	
	public Bus() {	}		//기본생성자
	public Bus(int busNember) {//인자생성자
		this.busNumber = busNember;
	}
	//승차 메소드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스 No : " + busNumber);
		System.out.println("버스 승객 수 : " + passengerCount);
		System.out.println("버스 수입 : " + money);
	}
	
	
}
