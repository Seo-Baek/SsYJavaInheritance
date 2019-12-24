package practise;

import java.util.Scanner;

public class Employee_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고용형태 - 정규직<P>, 임시직<T>를 입력하세요.");
		String type = sc.next();
		
		if(type.equalsIgnoreCase("p") || type.equals("ㅔ")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요. ");
			Permanent p = new Permanent(sc.next(),sc.nextInt(), sc.nextInt());
			p.prn();
		} else if(type.equalsIgnoreCase("t") || type.equals("ㅅ")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요. ");
			Temporary t = new Temporary(sc.next(),sc.nextInt(), sc.nextInt());
			t.prn();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	
		sc.close();
	}
	
}
