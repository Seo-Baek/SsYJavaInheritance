package Abstract;

public class SmartPhone_main {

	public static void main(String[] args) {
		
		Iphone ip = new Iphone();
		ip.spec();
		ip.purpose();
		System.out.println();
		Galaxy gx = new Galaxy();
		gx.spec();
		gx.purpose();
	}

}
