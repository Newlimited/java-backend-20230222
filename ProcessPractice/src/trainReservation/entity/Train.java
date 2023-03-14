package trainReservation.entity;

import java.util.List;

// 기차 정보 Entity class
//비용 (class - 출발 역과 도착 역에 따른 금액)
// 정차역 - 정차역에 대한 (class 추가 - 역명, 도착시간, 출발시간)
// 남아있는 좌석 - (class - 호차, 좌석 번호, 좌석 상태)
public class Train {
	private String trainNumber;
	private String departureStation;
	private String departureTime;
	private String arriavalStation;
	private String arrivalTime;
	private int takeTimeMinute;
	private String type;
	private List<StopStation> stopStations;
	private List<Seat> seats;

	public Train() {
	}

	public Train(String trainNumber, String departureStation, String departureTime, String arriavalStation,
			String arrivalTime, int takeTimeMinute, String type, List<StopStation> stopStations, List<Seat> seats) {
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.departureTime = departureTime;
		this.arriavalStation = arriavalStation;
		this.arrivalTime = arrivalTime;
		this.takeTimeMinute = takeTimeMinute;
		this.type = type;
		this.stopStations = stopStations;
		this.seats = seats;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArriavalStation() {
		return arriavalStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTakeTimeMinute() {
		return takeTimeMinute;
	}

	public String getType() {
		return type;
	}

	public List<StopStation> getStopStations() {
		return stopStations;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + 
				", departureStation=" + departureStation + 
				", departureTime="	+ departureTime + 
				", arriavalStation=" + arriavalStation + 
				", arrivalTime=" + arrivalTime + 
				", takeTimeMinute=" + takeTimeMinute + 
				", type=" + type + 
				", stopStations=" + stopStations + 
				", seats=" + seats + "]";
	}

}