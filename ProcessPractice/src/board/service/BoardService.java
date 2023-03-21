package board.service;

import java.util.List;

import board.common.constant.ResponseMessage;
import board.dto.reqeuset.board.PatchBoardDto;
import board.dto.reqeuset.board.PostBoardDto;
import board.dto.response.ResponseDto;
import board.dto.response.board.DeleteBoardResponseDto;
import board.dto.response.board.GetBoardListResponseDto;
import board.dto.response.board.GetBoardResponseDto;
import board.dto.response.board.PatchBoardResponseDto;
import board.dto.response.board.PostBoardResponseDto;
import board.entity.Board;
import board.entity.User;
import board.repository.BoardRepository;
import board.repository.UserRepository;

public class BoardService {

	private BoardRepository boardRepository;
	private UserRepository userRepository;

	public BoardService() {
		boardRepository = new BoardRepository();
		userRepository = new UserRepository();
	}

	public ResponseDto<PostBoardResponseDto> postBoard(PostBoardDto dto) {
		PostBoardResponseDto data = null;

		String email = dto.getWriterEmail();

		User user = userRepository.findByEmail(email);

		if (user == null)
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_USER, null);
		Board board = new Board(dto, user);
		boardRepository.save(board);
		data = new PostBoardResponseDto();
		return new ResponseDto<>(true, ResponseMessage.SUCCESS, data);
	}

	public ResponseDto<List<GetBoardListResponseDto>> getBoardList() {
		List<GetBoardListResponseDto> data = null;
		// Board 타입을 GetBoardListResponseDto 타입으로 바꿔줘야한다. ->
		// GetBoardListResponseDto 에서 Board 생성자를 만들어준다
		List<Board> boardList = boardRepository.findBy();
		// 바로 접근을 못하기 때문에 boardRepository 에 List<Board> findBy 메서드를 만들어준다.
		data = GetBoardListResponseDto.copyList(boardList);
		return new ResponseDto<>(true, ResponseMessage.SUCCESS, data);
	}

	public ResponseDto<GetBoardResponseDto> getBoard(int boardNumber) {

		GetBoardResponseDto data = null;
		Board board = boardRepository.findByBoardNumber(boardNumber);
		if (board == null)
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_BOARD, data);
		board.increaseviewCount();
		;
		boardRepository.save(board);

		data = new GetBoardResponseDto(board);
		return new ResponseDto<>(true, ResponseMessage.SUCCESS, data);
	}

	public ResponseDto<PatchBoardResponseDto> patchBoard(PatchBoardDto dto) {
		PatchBoardResponseDto data = null;
		String email = dto.getEmail();
		int boardNumber = dto.getBoardNumber();

		User user = userRepository.findByEmail(email);
		if (user == null)
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_USER, null);

		Board board = boardRepository.findByBoardNumber(boardNumber);
		if (board == null)
			return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_BOARD, null);
		if (!board.getWriterEmail().equals(email))
			return new ResponseDto<>(false, ResponseMessage.NOT_PERMISSION, null);

		board.patch(dto);
		boardRepository.save(board);

		data = new PatchBoardResponseDto(board);
		return new ResponseDto<>(true, ResponseMessage.SUCCESS, data);
	}

	public ResponseDto<List<DeleteBoardResponseDto>> deleteBoard(int boardNumber, String eamil) {

		List<DeleteBoardResponseDto> data = null;
		
		User user = userRepository.findByEmail(eamil);
		if(user == null) return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_USER, null);
		
		Board board = boardRepository.findByBoardNumber(boardNumber);
		if(board == null) return new ResponseDto<>(false, ResponseMessage.NOT_EXIST_BOARD, null);
		if(!board.getWriterEmail().equals(eamil)) {
			return new ResponseDto<>(false, ResponseMessage.NOT_PERMISSION, null);
		}

		boardRepository.deleteByBoardNumber(boardNumber);
		List<Board> boardList = boardRepository.findBy();
		data = DeleteBoardResponseDto.copyList(boardList);
		return new ResponseDto<>(true, ResponseMessage.SUCCESS, data);
	}
}