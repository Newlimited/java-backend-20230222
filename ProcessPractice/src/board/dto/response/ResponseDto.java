package board.dto.response;

// Formatter를 정의 -> 값을 반환해주기위해서
// 반환해주는 메서드의 데이터타입이 다 다를것임
// 그래서 유연하게 반환해줘야 하기 때문에 D를 쓴다(제너릭)
// 따라서 D를 타입변수로쓰려면 매게로 받아와야한다. <D>
public class ResponseDto<D> {

	private boolean status;
	private String message;
	private D date;

	public ResponseDto() {
	}

	public ResponseDto(boolean status, String message, D date) {
		this.status = status;
		this.message = message;
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public D getDate() {
		return date;
	}

	public void setDate(D date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ReseponseDtop [status=" + status + ", message=" + message + ", date=" + date + "]";
	}

}
