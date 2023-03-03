package example.SignIn;

import java.util.Scanner;

//로그인 프로세스 구현
public class SignIn {

	// 입력
	// 아이디, 비밀번호
	public static void main(String[] args) {
		final String ID = "qwer1234";
		final String PASSWORD = "qwer1234";

		// 1. 사용자로부터 아이디와 패스워드 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요");
		System.out.println("아이디 : ");
		String userId = scanner.nextLine();
		System.out.println("비밀번호 :");
		String userPassword = scanner.nextLine();

		// 2. 사용자가 모두 (아이디와 비밀번호) 입력했는지 검증
		// (userId, userPassword 변수가 비었는지 확인)
		// 문자열에서 값이 비었는지 확인하는 기능(메서드)
		// string.isEmpty() : 비었으면 true, 아니면 false
		if (userId.isEmpty() || userPassword.isEmpty()) {
			System.out.println("모두 입력하세요.");
			return; // 리턴은 프로세스를 완전 종료시킨다. (해당 메서드를 종료시킴)
		}
		// if 가 같은 라인이면 OR 형태
		// if 안에 if 가 있는 형태 = AND 형태

		// 3. 사용자 입력값과 저장된 값이 같은지 검증 
		// 정상 프로세스가 if 안에 들어가면 안된다. 즉 로그인이되었습니다.가 밖으로 빠져야한다.
		if (!userId.equals(ID) || !userPassword.equals(PASSWORD)) {
			System.out.println("로그인 정보가 일치하지 않습니다.");
			return;
		} 
			System.out.println("로그인 되었습니다.");
		
		// 메인프로세스를 if에 넣으면안된다.
	}
	// 결과
	// 성공 , 실패 (모두 입력하지 않았을 때, 정보가 일치하지 않을 때)
}