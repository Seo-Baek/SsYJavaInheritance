package practise;

import java.util.Scanner;

public class Shape_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요.(1.원형, 2.사각형)");
		System.out.print("도형 선택 => ");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.print("반지름 입력 => ");
			Circle c = new Circle(sc.nextInt());
			c.prn();
		} else if(select == 2) {
			System.out.print("가로 => ");
			int w = sc.nextInt();
			System.out.print("세로 => ");
			Rectangle r = new Rectangle(w, sc.nextInt());
			r.prn();
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
	}

}
