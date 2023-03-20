package board.service;

import board.common.constant.ResponsMessage;
import board.dto.reqeuset.board.PostBoardDto;
import board.dto.response.ResponseDto;
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

	}

	public ResponseDto<PostBoardResponseDto> postBoard(PostBoardDto dto) {
		PostBoardResponseDto data = null;

		String email = dto.getWriterEmail();

		User user = userRepository.findByEmail(email);

		if (user == null)
			return new ResponseDto<>(false, ResponsMessage.NOT_EXIST_USER, null);
		Board board = new Board(dto, user);
		boardRepository.save(board);
		data = new PostBoardResponseDto();
		return new ResponseDto<>(true, ResponsMessage.SUCCESS, data);
	}
}