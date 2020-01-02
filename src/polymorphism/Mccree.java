package polymorphism;

public class Mccree implements OverWatch {

	@Override
	public void name() {
		System.out.println("이 름 : 맥크리");
	}

	@Override
	public void leftClick() {
		System.out.println("왼쪽버튼 클릭 : 피스키퍼");
	}

	@Override
	public void rightClick() {
		System.out.println("오른쪽버튼 클릭 : 모든 총알 발사");
	}

	@Override
	public void shiftButton() {
		System.out.println("Shift버튼 : 구르기");
	}

	@Override
	public void eButton() {
		System.out.println("e버튼 : 섬광탄");
	}

	@Override
	public void qButton() {
		System.out.println("q버튼 : 황야의 무법자");
	}
}
