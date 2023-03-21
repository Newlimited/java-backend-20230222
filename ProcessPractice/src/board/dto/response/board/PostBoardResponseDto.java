package board.dto.response.board;

import java.util.List;

import board.entity.Board;
import board.entity.Comment;
import board.entity.Like;

public class PostBoardResponseDto {

	private int boardNumber;
	private String boardImageUrl;
	private String writerEmail;
	private String writerNickName;
	private String writerProfileImageUrl;
	private String writeDate; // 사용자로부터 받아도 되고, Date로 넣어도되고 지금은 지정으로...
	private String title;
	private String content;
	private int viewcount;
	private List<Like> likeList;
	private List<Comment> commentList; // List 인데 비어있음 처음엔

	public PostBoardResponseDto() {
	}

	public PostBoardResponseDto(int boardNumber, String boardImageUrl, String writerEmail, String writerNickName,
			String writerProfileImageUrl, String writeDate, String title, String content, int viewcount,
			List<Like> likeList, List<Comment> commentList) {
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.writerEmail = writerEmail;
		this.writerNickName = writerNickName;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.viewcount = viewcount;
		this.likeList = likeList;
		this.commentList = commentList;
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

	public PostBoardResponseDto(Board board) {
		this.boardNumber = board.getBoardNumber();
		this.boardImageUrl = board.getBoardImageUrl();
		this.writerEmail = board.getWriterEmail();
		this.writerNickName = board.getWriterNickName();
		this.writerProfileImageUrl = board.getWriterProfileImageUrl();
		this.writeDate = board.getWriteDate();
		this.title = board.getTitle();
		this.content = board.getContent();
		this.viewcount = board.getviewCount();
		this.likeList = board.getLikeList();
		this.commentList = board.getCommentList();
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

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public void setLikeList(List<Like> likeList) {
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
		return "PostBoardResponseDto [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl
				+ ", writerEmail=" + writerEmail + ", writerNickName=" + writerNickName + ", writerProfileImageUrl="
				+ writerProfileImageUrl + ", writeDate=" + writeDate + ", title=" + title + ", content=" + content
				+ ", viewcount=" + viewcount + ", liketList=" + likeList + ", commentList=" + commentList + "]";
	}
}
