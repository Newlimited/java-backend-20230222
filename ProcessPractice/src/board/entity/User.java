package board.entity;

import board.dto.reqeuset.user.SignUpDto;

//	회원 데이터
//
//	이메일주소(문자열)/ 비밀번호(문자열) / 비밀번호 확인(문자열) / 닉네임 (문자열)/ 핸드폰 번호(문자열)/ 주소(문자열)
//	private String passwordCheck; 검증만하는용도 
//	 상세주소(문자열) / 프로필 사진(문자열)
public class User {
	private String email;
	private String password;
	private String nickName;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;

	public User() {
	}

	public User(String email, String password, String nickName, String phoneNumber, String address,
			String addressDetail, String profileImageUrl) {
		this.email = email;
		this.password = password;
		this.nickName = nickName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
	}

	public User(SignUpDto dto) {
		this.email = dto.getEmail();
		this.password = dto.getPassword();
		this.nickName = dto.getNickName();
		this.phoneNumber = dto.getPhoneNumber();
		this.address = dto.getAddress();
		this.addressDetail = dto.getAddressDetail();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", nickName=" + nickName + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl="
				+ profileImageUrl + "]";
	}

}