package practise;

public class Permanent extends Employee {

	private int pay;
	private int bonus;
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Permanent() {  }
	public Permanent(String name, int pay, int bonus) {
		super(name,"정규직");
		setPay(pay);
		setBonus(bonus);
	}
	

	@Override
	public int getPay() {
		return pay + bonus;
	}

	
	
}
