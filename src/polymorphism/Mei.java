package polymorphism;

public class Mei implements OverWatch {

	@Override
	public void name() {
		System.out.println("이 름 : 메이");
	}

	@Override
	public void leftClick() {
		System.out.println("왼쪽버튼 클릭 : 냉각총");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽버튼 클릭 : 고드름");
	}

	@Override
	public void shiftButton() {
		System.out.println("Shift버튼 : 급속 빙결");
	}

	@Override
	public void eButton() {
		System.out.println("e버튼 : 빙벽");
	}

	@Override
	public void qButton() {
		System.out.println("q버튼 : 눈보라");
	}

	
}
