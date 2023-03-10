package chapter5.C_DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//날짜 및 시간
public class DateTime {
	
	public static void main(String[] args) {
		//System.crrentTimeMillis()
		//현재시간을 long 타입으로 0.001초 단위로 표현해줌
		//기준 1970년 1월 1일 에서 얼마나 지났는지 
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		for (int count = 0; count < 100000000; count++) {
			count++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		// for를 돌릴때 걸리는 시간을 측정한것 -- > 시작 시각 -> for 반복 -> 끝난 시각 
		
		// Date class
		// 날짜를 관리 해주는 클래스
		// 주로 날짜와 관련된 데이터타입을 취급할 때 사용
		
		Date date = new Date();
		System.out.println(date.getMonth()); 
		//3월인데 2월이나옴...month는 index를 다루는개념이라 1월이 0이다.
		
//		date.setHours(date.getHours() + 2);// 시각을 맞추는것. - > 수정
		System.out.println(date);
		
		Date now = Date.from(Instant.now()); // new Date 랑 같음
		System.out.println(now); // 이런형식으로 많이 쓴다.
		
		Date minusTwoHour = Date.from(Instant.now().minus(2, ChronoUnit.HOURS)); // 외워야함
		
		System.out.println(minusTwoHour); // 2 시간 감소 된 시각을 나타냄
		
		// SimpleDateFormat
		// Date 타입의 참조변수를 지정한 포멧의 문자열로 변경해주는 클래스
		// y: 연 , M: 월, d: 일 , H: 시각 , m: 분 , s: 초 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd. HH:mm:ss");
		// sdf 라고도 쓴다.
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		// Time Package
		// Date 와 Calander 클래스의 단점 보완
		
		// LocalDate class
		// 날짜를 관리해주는 class
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate localDateOf = LocalDate.of(2022, 12, 25);
		System.out.println(localDateOf); // 직접 시각 변경
		
		// LocalTime class
		// 시간을 관리해주는 클래스
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime localTimeOf = LocalTime.of(12, 40);
		System.out.println(localTimeOf);
		
		// LocalDateTime class
		// 날짜와 시각 관리를 해주는 클래스
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateOf);
	}

}
