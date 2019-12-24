package inheritance;

import java.util.Scanner;

public class Remote_main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0, su =0;
		
		while(true) {	// 무한반복
			System.out.print("1. TV\t2. Radio\t3. Computer\t4. 종료 >>> ");
			menu = sc.nextInt();
			
			if(menu == 4) {
				break;
			}
			
			System.out.print("1. 볼륨 Up\t2. 볼륨 Down >>> ");
			su = sc.nextInt();
			
			switch(menu) {
				case 1 :	//TV
					if(su == 1) {
						tv.volume_Up();
					} else if(su == 2) {
						tv.volume_Down();
					}
					break;
				case 2 :	//Radio
					if(su == 1) {
						radio.volume_Up();
					} else if(su == 2) {
						radio.volume_Down();
					}
					break;
				case 3 :	//Computer
					if(su == 1) {
						computer.volume_Up();	// 볼륨 증가 메소드 호출
					} else if(su == 2) {	
						computer.volume_Down();	// 볼륨 감소 메소드 호출
					}
			}	//switch~case end
			
			System.out.println();
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Vol >>   TV    : " + tv.getVolume() + " / Radio  : " + radio.getVolume() + " / Computer : " + computer.getVolume());
			System.out.println();
		}	//while end
		
		System.out.println();
		System.out.println("수고 하셨습니다.");
		
		sc.close();
				
	}

}
