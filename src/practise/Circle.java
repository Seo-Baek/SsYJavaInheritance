package practise;

public class Circle implements Shape {

	int x;
	final float RADIUS = 3.14f;

	Circle(int x) {
		this.x = x;
	}
	@Override                                                                      
	public float findArea() {
		return RADIUS * x * x;
	}
	@Override
	public void prn() {
		System.out.println("============================");
		System.out.println("원의 면적 : " + findArea());
	}

}
