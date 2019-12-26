package Abstract;

public class Permanent extends Employee {

	int pays;
	int bonus;
	
	Permanent(String name, int pays, int bonus) {
		super(name, "정규직");
		this.pays = pays;
		this.bonus = bonus;
	}
	public int getPays() {
		return pays;
	}
	public void setPays(int pays) {
		this.pays = pays;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	int getPay() {
		return pays + bonus;
	}
	
}
