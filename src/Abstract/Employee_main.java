package Abstract;

import java.util.Scanner;

public class Employee_main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고용형태 - 정규직<P>,임시직<T>를 입력하세요.");
		String type = sc.next();
		
		if(type.equalsIgnoreCase("t") || type.equals("ㅅ")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			Temporary tem = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			tem.prn();
		} else if(type.equalsIgnoreCase("P") || type.equals("ㅔ")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			Permanent per = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());
			per.prn();
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
		
	}
}
