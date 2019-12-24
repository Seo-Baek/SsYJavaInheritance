package inheritance;

public class Sonata extends Car{

	//int cc;
	//int door;
	String model;	//모델명
	
	void prn() {
		System.out.println("모델명 : " + model);
		super.prn();
	}
	
}
