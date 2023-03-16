package board.entity;

//좋아요한 사용자 이메일(문자열)/
//
//좋아요한 사용자 프로필 사진(문자열)/
//
//좋아요한 사용자 닉네임 (문자열)
public class Like {
	private String userEmail;
	private String userprofileImageUrl;
	private String userNickName;

	public Like() {
	}

	public Like(String userEmail, String userprofileImageUrl, String userNickName) {
		this.userEmail = userEmail;
		this.userprofileImageUrl = userprofileImageUrl;
		this.userNickName = userNickName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserprofileImageUrl() {
		return userprofileImageUrl;
	}

	public void setUserprofileImageUrl(String userprofileImageUrl) {
		this.userprofileImageUrl = userprofileImageUrl;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	@Override
	public String toString() {
		return "Like [userEmail=" + userEmail + ", userprofileImageUrl=" + userprofileImageUrl + ", userNickName="
				+ userNickName + "]";
	}

}
