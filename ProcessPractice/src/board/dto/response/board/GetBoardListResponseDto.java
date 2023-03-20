package board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import board.entity.Board;

public class GetBoardListResponseDto {

	private int boardNumber;
	private String writerProfileImageUrl;
	private String writerNickname;
	private String writeDate;
	private	String title;
	private	String content;
	private String boardImageUrl;
	private int commentCount;
	private int likeCount;
	private int viewCount;
	
	public GetBoardListResponseDto() {
	}
	
	public GetBoardListResponseDto(int boardNumber, String writerProfileImageUrl, String writerNickname,
			String writeDate, String title, String content, String boardImageUrl, int commentCount, int likeCount,
			int viewCount) {
		this.boardNumber = boardNumber;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerNickname = writerNickname;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.boardImageUrl = boardImageUrl;
		this.commentCount = commentCount;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
	}

	public GetBoardListResponseDto(Board board) {
		this.boardNumber = board.getBoardNumber();
		this.writerProfileImageUrl = board.getWriterProfileImageUrl();
		this.writerNickname = board.getWriterNickName();
		this.writeDate = board.getWriteDate();
		this.title = board.getTitle();
		this.content =board.getContent();
		this.boardImageUrl = board.getBoardImageUrl();
		this.commentCount = board.getCommentList().size();
		this.likeCount = board.getLikeList().size(); // 좋아요 취소도 가능해서 
		this.viewCount = board.getViewcount();
	}
public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}
	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}
	public String getWriterNickname() {
		return writerNickname;
	}
	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
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
	public String getBoardImageUrl() {
		return boardImageUrl;
	}
	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	@Override
	public String toString() {
		return "GetBoardListResponseDto [boardNumber=" + boardNumber + ", writerProfileImageUrl="
				+ writerProfileImageUrl + ", writerNickname=" + writerNickname + ", writeDate=" + writeDate + ", title="
				+ title + ", content=" + content + ", boardImageUrl=" + boardImageUrl + ", commentCount=" + commentCount
				+ ", likeCount=" + likeCount + ", viewCount=" + viewCount + "]";
	}
	public static List<GetBoardListResponseDto> copyList(List<Board> boardList){
		List<GetBoardListResponseDto> result = new ArrayList<>();
		for(Board board : boardList) {
			GetBoardListResponseDto item = new GetBoardListResponseDto(board);
			result.add(item);
		}
		return result;
		
	}
	
}
