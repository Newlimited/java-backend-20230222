package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.reqeuset.board.PostBoardDto;
import board.dto.reqeuset.user.SignInDto;
import board.dto.reqeuset.user.SignUpDto;

//DAO = > Data Access Object
// 이메일은 중복이 되면안된다.  - > 중복을 검사 DB에서 체크 후 반환
// 비밀번호 서로 같은지 , 같지않으면 반환 
// 휴대폰번호도 중복검사. 
// 클라이언트가 서버에 요청Request -> 서버에서 값을 준다 -- >> 프로그램
public class BoardApplication {
	private static BoardController boardController = new BoardController();
	private static UserController userController = new UserController();
	private static final String SIGN_UP = "POST /sign-up";
	private static final String SIGN_IN = "POST /sign-in";
	private static final String POST_BOARD = "POST /board";

	private static final String GET_BOARD_LIST = "GET /board/list";
	private static final String GET_BOARD = "GET /board";

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("URL End Point : ");
			String endPoint = scanner.nextLine();

			switch (endPoint) {
			case SIGN_UP:
				SignUpDto signUpDto = new SignUpDto();
				System.out.println("이메일 주소 :");
				signUpDto.setEmail(scanner.nextLine());
				System.out.println("비밀번호 :");
				signUpDto.setPassword(scanner.nextLine());
				System.out.println("비밀번호 확인 :");
				signUpDto.setPasswordCheck(scanner.nextLine());
				System.out.println("닉네임 :");
				signUpDto.setNickName(scanner.nextLine());
				System.out.println("휴대폰 번호 :");
				signUpDto.setPhoneNumber(scanner.nextLine());
				System.out.println("주소 :");
				signUpDto.setAddress(scanner.nextLine());
				System.out.println("상세 주소 :");
				signUpDto.setAddressDetail(scanner.nextLine());
//				System.out.println(dto.toString());
				userController.signUp(signUpDto);
				break;
			case SIGN_IN:
				SignInDto signInDto = new SignInDto();
				System.out.print("이메일 주소 :");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 :");
				signInDto.setPassword(scanner.nextLine());

//				System.out.println(signInDto.toString());
				userController.signIn(signInDto);
				break;
			case POST_BOARD:
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.print("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.println("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.println("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.println("작성자 이메일 : ");
				postBoardDto.setWriterEmail(scanner.nextLine());

				boardController.postBoard(postBoardDto);
				break;
			default:
				System.out.println(HttpStatus.NOT_FOUND); // HTTP 에서 파일을 찾지 못할 때
//				System.out.println("404 Not Found"); //HTTP 에서 파일을 찾지 못할 때

			}
		}
	}
}
