package Exam;

public class TakeTrans {
	
	public static void main(String[] args) {
		
	Student student1 = new Student("홍길동", 50000);
	Student student2 = new Student("김둘리", 70000);
	
	Bus bus100 = new Bus(100);
	
	Subway subwayGreen = new Subway(2);
	
	student1.takeBus(bus100);
	student2.takeSubway(subwayGreen);
	
	student1.showInfo();
	student2.showInfo();
	System.out.println("");
	
	bus100.showInfo();
	System.out.println("");
	subwayGreen.showInfo();
	
	}
	
}
