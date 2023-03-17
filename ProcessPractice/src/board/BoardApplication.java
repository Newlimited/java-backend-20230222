package board;

import java.util.Scanner;

import board.controller.UserController;
import board.dto.reqeuset.user.SignUpDto;

//DAO = > Data Access Object
// 이메일은 중복이 되면안된다.  - > 중복을 검사 DB에서 체크 후 반환
// 비밀번호 서로 같은지 , 같지않으면 반환 
// 휴대폰번호도 중복검사. 
// 클라이언트가 서버에 요청Request -> 서버에서 값을 준다 -- >> 프로그램
public class BoardApplication {
	private static UserController userController = new UserController();

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("URL End Point : ");
			String endPoint = scanner.nextLine();

			switch (endPoint) {
			case "POST /sign-up":
				SignUpDto dto = new SignUpDto();
				System.out.println("이메일 주소 :");
				dto.setEmail(scanner.nextLine());
				System.out.println("비밀번호 :");
				dto.setPassword(scanner.nextLine());
				System.out.println("비밀번호 확인 :");
				dto.setPasswordCheck(scanner.nextLine());
				System.out.println("닉네임 :");
				dto.setNickName(scanner.nextLine());
				System.out.println("휴대폰 번호 :");
				dto.setPhoneNumber(scanner.nextLine());
				System.out.println("주소 :");
				dto.setAddress(scanner.nextLine());
				System.out.println("상세 주소 :");
				dto.setAddressDetail(scanner.nextLine());
//				System.out.println(dto.toString());
				userController.signUp(dto);
				break;
			default:
				System.out.println("404 Not Found"); //HTTP 에서 파일을 찾지 못할 때

			}
		}
	}
}
