package trainReservation.dto;

import java.util.Scanner;

public class GetReservationDto {
	private String reservationNumber;
	public GetReservationDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("예약 번호 : ");
		this.reservationNumber = scanner.nextLine();
		
	}
	public GetReservationDto(String reservationNumber) {// 생성자
		this.reservationNumber = reservationNumber;
	}
	public String getReservationNumber() { 
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {// 메서드
		this.reservationNumber = reservationNumber;
	}
	@Override
	public String toString() {
		return "GetReservationDto [reservationNumber=" + reservationNumber + "]";
	}
}
