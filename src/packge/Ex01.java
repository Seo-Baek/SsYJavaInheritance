package packge;

import Model.MemberDTO;

/*
 * 패키지(Package) ?
 * 	- 서로 연관성이 있는 클래스를 묶어주는 역할(폴더와 유사)
 * 	- import 키워드 : 현재 패키지의 클래스에서 다른 패키지의 
 * 					다른 클래스를 사용하고 싶은 경우 import 해야 한다.
 * 					(단, 동일 패키지인 경우 생략 가능)
 * 		형식) import 패키지명.클래스명;
 * 	- 자동 import 단축키 : Ctrl + Shift + O
 */

public class Ex01 {
	public static void main(String[] args) {
		
		// Model 패키지에 있는 MemberDTO 클래스를 사용
		MemberDTO dto = new MemberDTO();
		
		// 멤버변수에 초기값 할당.
		dto.setId("hong");
		dto.setPwd("1234");
		dto.setName("홍길동");
		dto.setAge(27);
		dto.setAddress("서울시 마포구");
		
		// 화면에 출력
		System.out.println("회원 아이디 ==> " + dto.getId());
		System.out.println("회원 비밀번호 ==> " + dto.getPwd());
		System.out.println("회원 이름 ==> " + dto.getName());
		System.out.println("회원 나이 ==> " + dto.getAge());
		System.out.println("회원 주소 ==> " + dto.getAddress());
		
		
	}
}
