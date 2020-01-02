package Exam;

public class Subway {

	// 멤버변수
		int lineNumber;			//지하철 호선
		int passengerCount;		//승객 수
		int money;				//지하철 회사의 수입
		
		public Subway( ) {  }
		public Subway(int lineNumber) {
			this.lineNumber = lineNumber;
		}
		
		//승차 메소드
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		public void showInfo() {
			System.out.println("지하철 No : " + lineNumber);
			System.out.println("지하철 승객 수 : " + passengerCount);
			System.out.println("지하철 수입 : " + money);
		}
}
