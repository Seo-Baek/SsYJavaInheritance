package Interface;

public class Remote_main {

	public static void main(String[] args) {
		
		Audio a = new Audio();
		Computer c = new Computer();
		TV t = new TV();
		
		//Audio
		a.turnOn();
		a.setVolume(7);
		a.turnOff();
		System.out.println();
		
		//Computer
		c.turnOn();
		c.setVolume(13);
		c.turnOff();
		System.out.println();
		
		//TV
		t.turnOn();
		t.setVolume(0);
		t.turnOff();
		
	}

}
