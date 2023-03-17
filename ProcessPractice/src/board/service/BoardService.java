package board.service;

import boardrepository.BoardRepository;

public class BoardService {

	private BoardRepository boardRepository;
	
	public BoardService() {
		boardRepository = new BoardRepository();
		
	}
}
