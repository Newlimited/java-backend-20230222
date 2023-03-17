package board.dto.reqeuset.user;
// email,폰번호, 닉네임, 비밀번호 , 비밀번호 확인, 주소 ,상세 주소 

// request Input

public class SignUpDto {

	private String email;
	private String password;
	private String passwordCheck;
	private String phoneNumber;
	private String nickName;
	private String address;
	private String addressDetail;

	public SignUpDto() {
	}

	public SignUpDto(String email, String password, String passwordCheck, String phoneNumber, String nickName,
			String address, String addressDetail) {
		this.email = email;
		this.password = password;
		this.passwordCheck = passwordCheck;
		this.phoneNumber = phoneNumber;
		this.nickName = nickName;
		this.address = address;
		this.addressDetail = addressDetail;
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

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	@Override
	public String toString() {
		return "SignUpDto [email=" + email + ", password=" + password + ", passwordCheck=" + passwordCheck
				+ ", phoneNumber=" + phoneNumber + ", nickName=" + nickName + ", address=" + address
				+ ", addressDetail=" + addressDetail + "]";
	}

	public boolean validate() {
		boolean result = 
				this.email.isBlank() || 
				this.password.isBlank() || 
				this.passwordCheck.isBlank() || 
				this.phoneNumber.isBlank() || 
				this.nickName.isBlank() || 
				this.address.isBlank() || 
				this.addressDetail.isBlank();

		return result;
	}

}
