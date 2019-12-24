package practise;

public class Employee {
	
	private String name;
	private String type;
	
	public Employee() {	}
	public Employee(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPay() {
		return 0;
	}
	
	public void prn() {
		System.out.println("==========================");
		System.out.println("고용형태 : " + getType());
		System.out.println("이름 : " + getName());
		System.out.printf("급여 : %,d원" , getPay());
	}
}
