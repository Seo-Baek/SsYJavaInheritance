package Interface;

public interface RemoteControl {

	// 멤버변수
	int max_volume = 10;
	int min_volume = 1;
	
	//RemoteControl 클래스 안의 모든 메소드가 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
