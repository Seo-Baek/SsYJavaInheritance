package Interface;

public class MyPhone implements Camera, DMB, MP3 {

	@Override
	public void playMp3() {
		System.out.println("내 핸드폰에서 음악을 들어요.");
	}
	@Override
	public void WatchDMB() {
		System.out.println("내 핸드폰에서 TV를 봐요.");
	}
	@Override
	public void shot() {
		System.out.println("내 핸드폰에서 예쁜 사진을 찍어요.");
	}
}
