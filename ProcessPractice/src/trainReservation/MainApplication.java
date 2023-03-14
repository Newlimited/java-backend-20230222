package trainReservation;

import java.io.ObjectInputStream.GetField;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Cost;
import trainReservation.entity.Seat;
import trainReservation.entity.StopStation;
import trainReservation.entity.Train;

public class MainApplication {

	private static List<Train> trains = new ArrayList<>();
	private static List<Cost> costs = new ArrayList<>();
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		initData();

		while (true) {

// 변수에 원래 동사가 들어가면 안된다 , 즉 get 이 들어가면안됨. 
			GetTrainListDto dto = new GetTrainListDto();

			LocalTime departureTime = null;
// 원래 getTrainListDto로 변수명을 정햇음
//			System.out.print("출발 역 : ");
//			dto.setDepartureStation(scanner.nextLine());
//			System.out.print("도착 역 : ");
//			dto.setArrivalStation(scanner.nextLine());
//			System.out.print("출발 시간 : ");
//			dto.setDepartureTime(scanner.nextLine()); 
//			System.out.print("인원 수 : ");
//			dto.setNumberOfPeople(scanner.nextInt());
			if (dto.isEmpty()) {
//					dto.getArrivalStation().isBlank() ||  // 메서드로 작성
//				dto.getDepartureStation().isBlank() || 
//				dto.getDepartureTime().isBlank()){
				System.out.println("모두 입력하세요");
				continue;
			}
			try {
				departureTime = LocalTime.parse(dto.getDepartureTime(), timeFormatter);
			} catch (Exception exception) {
				System.out.println("잘못된 시간입니다.");
				continue;
			}
			if (dto.getNumberOfPeople() <= 0) {
				System.out.println("잘못된 인원입니다.");
				continue;
			}
			if (dto.isEqualStation()) {
//				dto.getDepartureStation().equals(dto.getArrivalStation())) 메서드로 작성
				System.out.println("출발역과 도착역이 같습니다.");
				continue;
			}

			List<Train> possibleTrains = new ArrayList<>();
			
			for (Train train : trains) {
				List<StopStation> stopStations = train.getStopStations();
				int sameStationIndex = -1;
				
				for (int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {
					String stopStationName = stopStations.get(stopStationIndex).getStationName();
					if (!dto.isEqualDepartureStation(stopStationName)) {
						continue;
					}
					LocalTime stationDepartureTime = LocalTime.parse(dto.getDepartureTime(),timeFormatter);
					if(stationDepartureTime.isBefore(departureTime)) { // 역 출발시간이 도착시간보다 이전인지 확인
						break;
					}
					sameStationIndex = stopStationIndex; //그럼 stopStationIndex가 0 이상이게된다.
					break;
				}
				if(sameStationIndex == -1) { // -1 이면 해당열차는 해당역을 거치지 않거나 지나간 열차이다.
					continue;
				}
				for(int stopStationIndex = 0; stopStationIndex < stopStations.size(); stopStationIndex++) {
					String stationName = stopStations.get(stopStationIndex).getStationName();
				if(!dto.isEqualArrivalStation(stationName)) { //도착역과 일치하는 이름이 있는지
					continue;
					}
				if(stopStationIndex <= sameStationIndex) { // 작을경우는 방향이 다른거임
					break;
				}
				possibleTrains.add(train);
				break;
				}
			}
			System.out.println(possibleTrains.toString()); // 이용할 수 있는 열차 출력
		}
	}


private static void initData() {
		
		costs.add(new Cost("부산역", "서울역", 30000));
		costs.add(new Cost("부산역", "대전역", 20000));
		costs.add(new Cost("부산역", "대구역", 10000));
		costs.add(new Cost("대구역", "서울역", 20000));
		costs.add(new Cost("대구역", "대전역", 10000));
		costs.add(new Cost("대전역", "서울역", 10000));

		costs.add(new Cost("서울역", "부산역", 30000));
		costs.add(new Cost("서울역", "대구역", 20000));
		costs.add(new Cost("서울역", "대전역", 10000));
		costs.add(new Cost("대전역", "부산역", 20000));
		costs.add(new Cost("대전역", "대구역", 10000));
		costs.add(new Cost("대구역", "부산역", 10000));
		
		Train train;
		
		List<Seat> seats = new ArrayList<>();
		List<StopStation> stopStations = new ArrayList<>();
		
		seats.add(new Seat(1, "A1", false));
		seats.add(new Seat(1, "B1", false));
		seats.add(new Seat(1, "A2", false));
		seats.add(new Seat(1, "B2", false));
		seats.add(new Seat(2, "A1", false));
		seats.add(new Seat(2, "B1", false));
		seats.add(new Seat(2, "A2", false));
		seats.add(new Seat(2, "B2", false));
		seats.add(new Seat(3, "A1", false));
		seats.add(new Seat(3, "B1", false));
		seats.add(new Seat(3, "A2", false));
		seats.add(new Seat(3, "B2", false));
		
		stopStations.add(new StopStation("서울역", "", "06:00"));
		stopStations.add(new StopStation("대전역", "06:45", "07:00"));
		stopStations.add(new StopStation("대구역", "07:45", "08:00"));
		stopStations.add(new StopStation("부산역", "09:00", ""));
		
		train = new Train("KTX001", "서울역", "06:00", "부산역", "9:00", 180, "KTX", stopStations, seats);
		trains.add(train);
		
		seats = new ArrayList<>();
		stopStations = new ArrayList<>();
		
		seats.add(new Seat(1, "A1", false));
		seats.add(new Seat(1, "B1", false));
		seats.add(new Seat(1, "A2", false));
		seats.add(new Seat(1, "B2", false));
		seats.add(new Seat(2, "A1", false));
		seats.add(new Seat(2, "B1", false));
		seats.add(new Seat(2, "A2", false));
		seats.add(new Seat(2, "B2", false));
		seats.add(new Seat(3, "A1", false));
		seats.add(new Seat(3, "B1", false));
		seats.add(new Seat(3, "A2", false));
		seats.add(new Seat(3, "B2", false));
		
		stopStations.add(new StopStation("부산역", "", "09:00"));
		stopStations.add(new StopStation("대구역", "09:45", "10:00"));
		stopStations.add(new StopStation("대전역", "10:45", "11:00"));
		stopStations.add(new StopStation("서울역", "12:00", ""));
		
		train = new Train("KTX002", "부산", "09:00", "서울역", "12:00", 180, "KTX", stopStations, seats);
		trains.add(train);

}
}