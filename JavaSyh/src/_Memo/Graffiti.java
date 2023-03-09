package _Memo;

import java.util.Scanner;

//class Ex{
//	int num;
//	String string;
//	
//	Ex(){
//		num = 10;
//		string = "String";
		// num 과 String 을 내부에서 초기화 하지말고 , 밖에서 초기화할
		// 값을 넣어줘라 -> 외부에서 값 주입  ==> 의존성역주입
//	}
//}
public class Graffiti {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount = 0;
		try {
			System.out.println("넣을 화폐 : ");
			exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 : ");
			exchangedCurrency = scanner.nextLine();
			System.out.println("금    액 : ");
			amount = scanner.nextInt();

		} catch (Exception exception) {
//			exception.printStackTrace();  int에 문자를 넣었을 경우...
			System.out.println("입력값의 타입이 맞지 않습니다.");
			return;
		}
		String exchangingCurrencyCheck = exchangingCurrency.toUpperCase();
		String exchangedCurrencyCheck = exchangedCurrency.toUpperCase();

		System.out.println(exchangingCurrencyCheck + " " + exchangedCurrencyCheck + " " + amount);	
	}
}
