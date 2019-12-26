package Abstract;

public class Galaxy extends SmartPhone {
	
	@Override
	public void spec() {
		company = "삼성";
		name = "갤럭시 Note 10";
		color = "흰색";
		size = "17cm";
		weight = "300g";
		price = "1,400,000 원";
		System.out.println(company + "/" + name + "/" +
							color + "/" + size + "/" + 
							weight + "/" + price); 
	}
}
