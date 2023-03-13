package trainReservation;

import java.io.ObjectInputStream.GetField;
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

	public static void main(String[] args) {
		initData();
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			// 변수에 원래 동사가 들어가면 안된다 , 즉 get 이 들어가면안됨. 
			GetTrainListDto dto = new GetTrainListDto(); 
			// 원래 getTrainListDto로 변수명을 정햇음
//			System.out.print("출발 역 : ");
//			dto.setDepartureStation(scanner.nextLine());
//			System.out.print("도착 역 : ");
//			dto.setArrivalStation(scanner.nextLine());
//			System.out.print("출발 시간 : ");
//			dto.setDepartureTime(scanner.nextLine()); 
//			System.out.print("인원 수 : ");
//			dto.setNumberOfPeople(scanner.nextInt());
			if(dto.getArrivalStation().isBlank() || 
				dto.getDepartureStation().isBlank() || 
				dto.getDepartureTime().isBlank()){
				System.out.println("모두 입력하세요");
				continue;
			}
			System.out.println(dto.toString());	}
		//dto 인스턴스 , 입력받은값을 넣어주고있음 23~34
		// 모든 메서드나 함수에 대해서 적용되는 법칙
		// Garbage in garbage out
		// Dto 데이터 전송 객체 , Data Transfer Object.
		// 데이터 종합하여 하나의 객체로 만들어서 넘겨줌.
		
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
		stopStations.add(new StopStation("대전역"," 06:45", "07:00"));
		stopStations.add(new StopStation("대구역"," 07:45", "08:00"));
		stopStations.add(new StopStation("부산역"," 09:00", ""));
		
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
		stopStations.add(new StopStation("대구역"," 09:45", "10:00"));
		stopStations.add(new StopStation("대전역"," 10:45", "11:00"));
		stopStations.add(new StopStation("서울역"," 12:00", ""));

		train = new Train("KTX002", "부산역", "09:00", "서울역", "12:00", 180, "KTX", stopStations, seats);
		trains.add(train);
		
	}
}
