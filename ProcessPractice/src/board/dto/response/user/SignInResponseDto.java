package board.dto.response.user;

import java.util.UUID;

import board.entity.User;

public class SignInResponseDto {

	private String email;
	private String nickName;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;
	private String token; // 로그인 시 증명 해줄 수 있는 증명 도구 (반환도구)
	public SignInResponseDto() {
	}
	public SignInResponseDto(String email, String nickName, String phoneNumber, String address, String addressDetail,
			String profileImageUrl, String token) {
		this.email = email;
		this.nickName = nickName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
		this.token = token;
	}
	public SignInResponseDto(User user) {
		this.email = user.getEmail();
		this.nickName = user.getNickName();
		this.phoneNumber = user.getPhoneNumber();
		this.address = user.getAddress();
		this.addressDetail = user.getAddressDetail();
		this.profileImageUrl = user.getProfileImageUrl();
		this.token = UUID.randomUUID().toString();
	
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "SignInResponseDto [email=" + email + ", nickName=" + nickName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl=" + profileImageUrl
				+ ", token=" + token + "]";
	}


	
}
