package Abstract;

public class Temporary extends Employee {
	
	int time;
	int pays;
	
	Temporary(String name, int time, int pays){
		super(name, "임시직");
		this.time = time;
		this.pays = pays;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPays() {
		return pays;
	}
	public void setPays(int pays) {
		this.pays = pays;
	}
	
	@Override
	int getPay() {
		return time * pays;
	}
}
