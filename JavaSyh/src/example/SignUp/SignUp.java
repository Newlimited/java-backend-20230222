package example.SignUp;

import java.util.Scanner;

class SignUpDto{ 
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
}

// 회원가입 프로세스 구현
// 모둥 입력 되었는지 , 아이디 중복확인 , 비밀번호 및 비밀번호 확인 일치여부
// 모두 만족시 회원가입 완료
public class SignUp {

	// 입력
	// 아이디 , 패스워드, 패스워드확인, 이름
	public static void main(String[] args) {
		// 1. 사용자로부터 아이디, 패스워드, 패스워드 확인, 이름
		String[] idList = { "qwer", "asdf", "zxcv" };
		
		Scanner scanner = new Scanner(System.in);
		
		SignUpDto dto = new SignUpDto();
		System.out.println("아이디를 입력해 주세요.");
		dto.userId = scanner.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
		dto.userPassword = scanner.nextLine();
		System.out.println("비밀번호를 한번 더 입력해 주세요.");
		dto.userPasswordCheck = scanner.nextLine();
		System.out.println("이름을 입력해 주세요");
		dto.userName = scanner.nextLine();

		// 2. 모두 입력 받았는지 검증
		// string.isBlank() : 문자열이 비었거나 띄어쓰기만으로 구성했을 때
		// true, 아니면 false
		if (dto.userId.isBlank() 
				|| dto.userPassword.isBlank() 
				|| dto.userPasswordCheck.isBlank() 
				|| dto.userName.isBlank()) {
			System.out.println("모두 입력해 주세요");
		}
		// 3. 아이디 중복 체크
		// 3-1) 일반 for문 사용
//		for(int index = 0 ; index < idList.length; index++) {
//			if(userId.equals(idList[index])) {
//				System.out.println("아이디가 중복입니다.");
//				return;
//			}
//		}
		// 3-2) foreach 사용
		for (String id : idList) {
			if (id.equals(dto.userId)) {
				System.out.println("아이디가 중복입니다.");
				return;
			}
		}

		// 4. 비밀번호 일치 확인.
		if (!dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println("로그인 성공");
	}

	// 결과
	// 성공, 실패 ( 모두 입력하지 않았을 때, 아이디가 중복 될 때, 비밀번호가 서로 다를 때)
}
