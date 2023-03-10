package chapter5.D_EtcClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

// Timer - TimerTask
// 특정작업을 지연시킬 때 사용 
// TimerTask 클래스를 상속 받아서 run 메서드를 구현

class Delay extends TimerTask {
	@Override
	public void run() {
		// 지연 시킬 메서드
		System.out.println("지연됨 지연 지연지연 지연지연 지연지연지연지연지여여여여영ㄴ지여여여후루룽ㄹ;ㅏㅓ");
	}
}

public class EtcClass {

	public static void main(String[] args) {
		// Timer 클래스의 인스턴스로 TimerTask 구현체를 실행
		Timer timer = new Timer(true);
		Delay delay = new Delay();
		timer.schedule(delay, 1);// 1초 딜레이
		try {
			Thread.sleep(1000); // 1초동안 메인메서드가 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int index = 0; index < 1000000000; index++) {
			int a = 10;
			int b = 20;
			a += b;
			b -= a;
		}
		System.out.println("완료");
		// BigDecimal
		// 정확한 소수점 연산을 하기 위한 클래스
		// 오차를 없애줌
		double double1 = 9.47202303100;
		double double2 = 1.303202749;
		System.out.println(double1 + double2);
		
		BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(double1)); 
		// new BigDecimal(double1) --> 이상하게 나와서 문자열로 합산
		BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(double2));
		System.out.println(bigDecimal1.add(bigDecimal2));
		
		

		// DecimalFormat
		// 일정형식으로 데이터 출력해주는 클래스
		DecimalFormat decimalFormat = new DecimalFormat("-$###,###,###.00");
		System.out.println(decimalFormat.format(10_000_000)); // -$10,000,000.00
		// # 있으면 출력
		// , 콤마를 넣음 
		// 0 없어도 0으로채움
		// E 지수기호
		// 등등....
		
	}
}
