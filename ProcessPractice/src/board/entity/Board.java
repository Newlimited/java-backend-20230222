package board.entity;
//게시물 데이터

import java.text.SimpleDateFormat;

//
// 게시물 번호<게시물 식별 고유 키>(정수)/이미지(문자열)/작성자 이메일 (문자열) 
// 작성자 닉네임(문자열) / 작성일(Date// 그냥 문자열로 받는다) / 제목(문자열) 
// 내용 (문자열)/ 댓글 수(정수) / 좋아요 수(정수) /조회수(정수)/
// 좋아요 리스트
// 댓글  리스트
//	private int commentNumber;
//	private int likeNumber; 리스트 사이즈로 반환해주면 됨

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import board.dto.reqeuset.board.PatchBoardDto;
import board.dto.reqeuset.board.PostBoardDto;
import board.repository.BoardRepository;

public class Board {
	private int boardNumber;
	private String boardImageUrl;
	private String writerEmail;
	private String writerNickName;
	private String writerProfileImageUrl;
	private String writeDate; // 사용자로부터 받아도 되고, Date로 넣어도되고 지금은 지정으로...
	private String title;
	private String content;
	private int viewCount;
	private List<Like> likeList;
	private List<Comment> commentList; // List 인데 비어있음 처음엔

	public Board() {
	}

	public Board(int boardNumber, String boardImageUrl, String writerEmail, String writerNickName,
			String writerProfileImageUrl, String writeDate, String title, String content, int viewCount,
			List<Like> likeList, List<Comment> commentList) {
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.writerEmail = writerEmail;
		this.writerNickName = writerNickName;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.likeList = likeList;
		this.commentList = commentList;
	}
	public Board(PostBoardDto dto , User user) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		this.boardNumber = ++BoardRepository.index;
		this.boardImageUrl = dto.getBoardImageUrl();
		this.writerEmail = user.getEmail();
		this.writerNickName =user.getNickName();
		this.writerProfileImageUrl =user.getProfileImageUrl();
		this.writeDate = simpleDateFormat.format(now);
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.viewCount = 0;
		this.likeList = new ArrayList<>();
		this.commentList = new ArrayList<>();
	}
	

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardImageUrl() {
		return boardImageUrl;
	}

	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}

	public String getWriterEmail() {
		return writerEmail;
	}

	public void setWriterEmail(String writerEmail) {
		this.writerEmail = writerEmail;
	}

	public String getWriterNickName() {
		return writerNickName;
	}

	public void setWriterNickName(String writerNickName) {
		this.writerNickName = writerNickName;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getviewCount() {
		return viewCount;
	}

	public void setviewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public void setListList(List<Like> likeList) {
		this.likeList = likeList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Board [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl + ", writerEmail=" + writerEmail
				+ ", writerNickName=" + writerNickName + ", writerProfileImageUrl=" + writerProfileImageUrl
				+ ", writeDate=" + writeDate + ", title=" + title + ", content=" + content + ", viewCount=" + viewCount
				+ ", likeList=" + likeList + ", commentList=" + commentList + "]";
	}
	
	public void increaseviewCount() {
		this.viewCount++;
	}
	public void patch(PatchBoardDto dto) {
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.boardImageUrl = dto.getBoardImageUrl();
	}

}
