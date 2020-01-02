package packge;

import java.util.Scanner;

import Model.MemberDTO;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력해주세요.");
		MemberDTO[] mem = new MemberDTO[sc.nextInt()];
		while(true) {
			System.out.println("처리하실 업무를 선택해주세요.");
			System.out.println("(1. 고객입력 / 2. 모든 고객 출력/ 3. 고객 검색 )");
			System.out.println("종료를 원하시면 1,2,3을 제외한 아무 버튼이나 누르세요.");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				for(int i = 0; i < mem.length; i++) {
					mem[i] = new MemberDTO();
					System.out.print((i+1) + "번째 고객입니다.\n\n");
					System.out.print("회원 아이디 입력");
					mem[i].setId(sc.next());
					System.out.print("회원 패스워드 입력");
					mem[i].setPwd(sc.next());
					System.out.print("회원 이름 입력");
					mem[i].setName(sc.next());
					System.out.print("회원 나이 입력");
					mem[i].setAge(sc.nextInt());
					System.out.print("회원 주소 입력");
					mem[i].setAddress(sc.next());
					System.out.println("");
				}
				System.out.println("모든 고객이 정상적으로 입력되었습니다.");
				continue;
			} else if(menu == 2) {
				for(int i = 0; i < mem.length; i++) {
					System.out.println((i+1) + "번째 고객입니다.");
					System.out.println("회원 아 이 디 ==> " + mem[i].getId());
					System.out.println("회원 비밀 번호 ==> " + mem[i].getPwd());
					System.out.println("회원 이    름 ==> " + mem[i].getName());
					System.out.println("회원 나    이 ==> " + mem[i].getAge());
					System.out.println("회원 주   소 ==> " + mem[i].getAddress());
					System.out.println("");
				}
			} else if(menu == 3) {
				System.out.println("찾으려는 고객의 Id를 입력");
				String id = sc.next();
				for(int i = 0; i < mem.length; i++) {
					if(id.equals(mem[i].getId())) {
						System.out.println((i+1) + "번째 고객입니다.");
						System.out.println("회원 아 이 디 ==> " + mem[i].getId());
						System.out.println("회원 비밀 번호 ==> " + mem[i].getPwd());
						System.out.println("회원 이    름 ==> " + mem[i].getName());
						System.out.println("회원 나    이 ==> " + mem[i].getAge());
						System.out.println("회원 주   소 ==> " + mem[i].getAddress());
						System.out.println();
						}
					}
				} else {
					sc.close();
					System.exit(0);
			}
			
			
		}
		
			
	}
	
	
}
