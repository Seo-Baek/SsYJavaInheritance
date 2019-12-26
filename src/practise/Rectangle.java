package practise;

public class Rectangle implements Shape {

	int x,y;
	
	Rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public float findArea() {
		return x * y;
	}
	@Override
	public void prn() {
		System.out.println("============================");
		System.out.println("사각형의 면적 : " + findArea());
	}
	
}
