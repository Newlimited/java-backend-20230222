package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.reqeuset.board.PatchBoardDto;
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
	private static final String SIGN_UP = "회원가입"; // POST /sing-up
	private static final String SIGN_IN = "로그인"; // POST /sign-in

	private static final String POST_BOARD = "게시물 작성"; // POST /board

	private static final String GET_BOARD = "게시물 불러오기"; // GET /board
	private static final String GET_BOARD_LIST = "GET /board/list";

	private static final String PATCH_BOARD = "PATCH /board";
	private static final String DELETE_BOARD = "DELETE /board";

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
				System.out.print("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 : ");
				postBoardDto.setWriterEmail(scanner.nextLine());

				boardController.postBoard(postBoardDto);
				break;
			case GET_BOARD_LIST:

				boardController.getBoardList();
				break;
			case GET_BOARD:
				int boardNumber = 0;
				try {
					System.out.print("게시물 번호 : ");
					boardNumber = scanner.nextInt();
					// 예외처리 --> 정수만 넣어야하는데 입력값이 정수를 안넣을 경우도있다.
				} catch (Exception exception) {
					exception.printStackTrace();
//					System.out.println("정수값만 입력하세요");
					continue;
				}
				boardController.getBoard(boardNumber); // boardNumber 빨간줄나는 이유 try 괄호안에 선언되어잇음
		
			case PATCH_BOARD:
				patchBoard();
				break;
				
			case DELETE_BOARD:
				int deleteBoardNumber = 0;
				String deleteEmail = null;
				try 
				{	
					System.out.print("게시물 번호 : ");
					deleteBoardNumber = Integer.parseInt(scanner.nextLine());
					System.out.print("이메일 : ");
					deleteEmail = scanner.nextLine();

				} catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				boardController.deleteBoard(deleteBoardNumber, deleteEmail);
				break;
			default:
				System.out.println(HttpStatus.NOT_FOUND); // HTTP 에서 파일을 찾지 못할 때
//				System.out.println("404 Not Found"); //HTTP 에서 파일을 찾지 못할 때
			}
		}
	}
		private static void patchBoard() {
			PatchBoardDto patchBoardDto = new PatchBoardDto();
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("게시물 번호 : ");
				String patchBoardNumber = scanner.nextLine();
				patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));
				// patchBoardDto.setBoardNuimber(scanner.nextInt()); // int 경우 nextline 이 한번더
				// 먹히는에러가 터진다
				System.out.print("제목 : ");
				patchBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 : ");
				patchBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 : ");
				patchBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("이메일 : ");
				patchBoardDto.setEmail(scanner.nextLine());
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			boardController.patchBoard(patchBoardDto);
		}
}
