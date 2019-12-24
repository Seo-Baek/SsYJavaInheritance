package inheritance;

public class Volume {
	
	int vol = 1;
	
	// 볼륨을 올리는 메소드
	public void volume_Up() {
		vol++;
		if(vol >15) {
			vol = 15;
		}
	}
	
	// 볼륨을 내리는 메소드
	public void volume_Down() {
		vol--;
		if(vol <1) {
			vol = 1;
		}
	}
	
	public void setVolume(int volume) {
		vol = volume;
	}
	
	public int getVolume() {
		return vol;
	}
}
