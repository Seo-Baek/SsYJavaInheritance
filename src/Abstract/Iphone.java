package Abstract;

public class Iphone extends SmartPhone {
	
	@Override
	public void spec() {
		company = "애플";
		name = "아이폰11";
		color = "흰색";
		size = "15cm";
		weight = "200g";
		price = "1,500,000 원";
		System.out.println(company + "/" + name + "/" +
							color + "/" + size + "/" + 
							weight + "/" + price); 
	}
}
