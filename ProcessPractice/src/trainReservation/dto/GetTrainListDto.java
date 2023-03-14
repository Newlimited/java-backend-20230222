package trainReservation.dto;

import java.util.Scanner;

// DTO : Data Transfer Object
// Layer 간 데이터를 전송할 때 사용하는 객체

public class GetTrainListDto {
	private String departureStation;
	private String arrivalStation;
	private String departureTime;
	private int numberOfPeople;

	public GetTrainListDto() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출발 역 : ");
		this.departureStation = scanner.nextLine();
		System.out.print("도착 역 : ");
		this.arrivalStation = scanner.nextLine();
		System.out.print("출발 시간 : ");
		this.departureTime = scanner.nextLine();
		System.out.print("인원 수 : ");
		this.numberOfPeople = scanner.nextInt();
	
	}

	public GetTrainListDto(String departureStation, String arrivalStation, String departureTime, int numberOfPeople) {
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.departureTime = departureTime;
		this.numberOfPeople = numberOfPeople;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	@Override
	public String toString() {
		return "GetTrainListDto [departureStation=" + departureStation + ", arrivalStation=" + arrivalStation
				+ ", departureTime=" + departureTime + ", numberOfPeople=" + numberOfPeople + "]";
	}

	public boolean isEmpty() {
		return this.departureStation.isBlank() || 
				this.arrivalStation.isBlank() ||
				this.departureTime.isBlank();
		
	}
	public boolean isEqualStation() {
		return this.departureStation.equals(this.arrivalStation);
	}
	public boolean isEqualDepartureStation(String station) {
		return this.departureStation.equals(station);
	}
	public boolean isEqualArrivalStation(String station) {
		return this.arrivalStation.equals(station);
		
	}
}
