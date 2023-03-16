package board.entity;
//댓글 작성자 프로필 사진(문자열)/
//
//댓글 작성자 닉네임(문자열)/
//
//댓글 작성 지난 시간 (날짜)
//
//댓글 내용 (문자열)

import java.util.Date;

public class Comment {

	private String writerProfileImageUrl;
	private String writerNickName;
	private Date writeDateTime;
	private String content;
	
	public Comment() {
	}
	public Comment(String writerProfileImageUrl, String writerNickName, Date writeDateTime, String content) {
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerNickName = writerNickName;
		this.writeDateTime = writeDateTime;
		this.content = content;
	}
	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}
	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}
	public String getWriterNickName() {
		return writerNickName;
	}
	public void setWriterNickName(String writerNickName) {
		this.writerNickName = writerNickName;
	}
	public Date getWriteDateTime() {
		return writeDateTime;
	}
	public void setWriteDateTime(Date writeDateTime) {
		this.writeDateTime = writeDateTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Comment [writerProfileImageUrl=" + writerProfileImageUrl + ", writerNickName=" + writerNickName
				+ ", writeDateTime=" + writeDateTime + ", content=" + content + "]";
	}

}
