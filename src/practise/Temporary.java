package practise;

public class Temporary extends Employee {

	private int time;
	private int pay;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Temporary() {  }
	public Temporary(String name, int time, int pay) {
		super(name, "임시직");
		setTime(time);
		setPay(pay);
	}
	
	@Override
	public int getPay() {
		return pay * time;
	}
	
}
