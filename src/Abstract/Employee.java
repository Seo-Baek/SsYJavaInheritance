package Abstract;

public abstract class Employee {

	private String name;
	private String type;
	
	Employee(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	abstract int getPay();
	
	void prn() {
		System.out.println("================================");
		System.out.println("이름 : " + getName());
		System.out.println("고용형태 : " + getType());
		System.out.println("급여 : " + getPay());
	}
}
