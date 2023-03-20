package board.controller;

import board.common.constant.HttpStatus;
import board.dto.reqeuset.board.PostBoardDto;
import board.dto.response.ResponseDto;
import board.dto.response.board.PostBoardResponseDto;
import board.service.BoardService;

public class BoardController {

	private BoardService boardService;

	public BoardController() { // BoardService 에 의존성이 있다 라고 할 수 있다.
		boardService = new BoardService();
		// 의존성역전 - > 빈생성자에 직접 생산하는것이 아니라 받아서 온다
		// this.boardService ,, 생성자에 BoardService 데이터변수와 매게변수를 지정하여
		// 밖에서 받아오는것처럼 한다. 이것이 의존성역전 DIP Dependency Inverse Principle
	}
	public void postBoard(PostBoardDto dto) {
		// 인증 - 누군지 ? 인과는 - 권한 확인
		if (dto.auth()) {
			System.out.println(HttpStatus.UNAUTHORIZED);
			return;
		}
		if (dto.vaild()) {
			System.out.println(HttpStatus.BAD_REQUEST);
			// 타입이 잘못됏거나 입력값이 없을 때 반환되는 코드
			return;
		}
		ResponseDto<PostBoardResponseDto> response = boardService.postBoard(dto);
		System.out.println(response.toString());
	}
		
	}
