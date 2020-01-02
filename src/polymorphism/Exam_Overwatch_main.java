package polymorphism;

import java.util.Scanner;

public class Exam_Overwatch_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OverWatch ow = null;
		
		System.out.println("플레이할 캐릭터 번호 선택(1.메이 / 2.겐지/ 3.맥크리)");
		int ch = sc.nextInt();
		
		if(ch == 1) {
			ow = new Mei();	//다형성
		} else if(ch == 2) {
			ow = new Gengi();
		} else if(ch == 3) {
			ow = new Mccree();
		}
		
		ow.name();
		ow.leftClick();
		ow.rightClick();
		ow.shiftButton();	//다형성을 이용하여 객체를 생성하면
		ow.eButton();		//한 번의 메소드 호출로 
		ow.qButton();		//여러 자식 객체의 메소드를 이용할 수 있다.
		
		sc.close();
	}

}
