
package trainReservation.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import trainReservation.dto.GetTrainListDto;
import trainReservation.entity.Train;
import trainReservation.service.ReservationService;
// Controller class
// 사용자로 부터 입력받는 기능/ 입력받은 데이터를 검증하는 기능 / 비즈니스로직의 결과를 반환
public class ReservationController {
	
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
	
	private ReservationService reservationService;
	
	public ReservationController() {
		this.reservationService = new ReservationService();
	}
	
	public void reservation() {
		while (true) {

			// 변수에 원래 동사가 들어가면 안된다 , 즉 get 이 들어가면안됨. 
						GetTrainListDto dto = new GetTrainListDto();

						LocalTime departureTime = null;
			// 원래 getTrainListDto로 변수명을 정햇음
//						System.out.print("출발 역 : ");
//						dto.setDepartureStation(scanner.nextLine());
//						System.out.print("도착 역 : ");
//						dto.setArrivalStation(scanner.nextLine());
//						System.out.print("출발 시간 : ");
//						dto.setDepartureTime(scanner.nextLine()); 
//						System.out.print("인원 수 : ");
//						dto.setNumberOfPeople(scanner.nextInt());
						if (dto.isEmpty()) {
//								dto.getArrivalStation().isBlank() ||  // 메서드로 작성
//							dto.getDepartureStation().isBlank() || 
//							dto.getDepartureTime().isBlank()){
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
//							dto.getDepartureStation().equals(dto.getArrivalStation())) 메서드로 작성
							System.out.println("출발역과 도착역이 같습니다.");
							continue;
						} // 입력

		
						List<Train> possibleTrains = reservationService.getPossibleTrainList(dto, departureTime);
						System.out.println(possibleTrains.toString()); // 이용할 수 있는 열차 출력
	}
	}
}

