package chapter1.F_Opertaor;

// 연산자
// 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자

public class Operator {
	public static void main(String[] args) {
		// 산술 연산자

		// 덧셈 연산자 : +
		// 좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);

		// 뺄셈 연산자 : -
		// 좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);

		// 곱셈 연산자 : *
		// 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);

		// 나눗셈 연산자 : / (몫)
		// {몫만 반환하는게 아님... 실제로 나눈값의 전체를 반환 하지만
		// int로 다운캐스팅을 했기때문에 정수만 나타남}
		// 좌항에 우항을 나눈 값을 반환
		int remainderResult = 8 / 3;
		float float1 = 2.666F;
		int number1 = (int) float1;
		System.out.println(number1);
		System.out.println(remainderResult);

		double remainderResult2 = 8.0 / 3.0;
		System.out.println(remainderResult2); // 2.666666666665

		// 나머지 연산자 : % (나머지)
		// 좌항에 우항을 나눈 값의 나머지를 반환

		int remainderResult3 = 8 % 3;
		System.out.println(remainderResult3);
		// 정수와 정수를 연산하면 정수가 반환됨
		// 실수와 정수를 연산하면 실수가 반환됨
		// 실수와 실수를 연산하면 실수가 반환됨

		// 증감연산자: '변수' 자신을 1 증가 혹은 감소

		// 증가연산자 : ++
		// 연산자의 좌항 혹은 우항의 값을 1 증가 시킴
		int integer1 = 10;
		++integer1;
		System.out.println(integer1); // 11
		integer1++;
		System.out.println(integer1); // 12
		System.out.println("============");
		integer1 = 0;
		System.out.println(integer1); // 0
		System.out.println(++integer1); // 1

		System.out.println(integer1); // 1
		System.out.println(integer1++); // 1

		System.out.println(integer1); // 2
		// 컴퓨터는 위에서 아래로 왼쪽에서 오른쪽으로 읽는다.
		// ++ 를 읽고 integer1 을 읽으면 1 이 증가된 상태의 결과가 나온다.
		// integer1 ++ 는 integer1 을 먼저 읽고나서 ++ 하기 때문에 integer1 을 먼저 출력 후
		// 1 증가가 된다 .
		// 따라서 integer1++ 는 그 다음 integer1 출력 때 증가된게 출력된다.
//		상수에는 증감 연산자 사용 불가능
//		final int NUMBER = 0;
//		NUMBER++;  NUMBER는 final 로 선언되었기 때문에 ++ 할 수 없다.
//		0++;  마찬가지로 리터럴 상수 자체를 증감 할 수 없다.
		System.out.println("============");
		// 감소 연산자 : --
		// 연산자의 좌항 혹은 우항의 값을 1 감소 시킴
		int integer2 = 10;
		--integer2;
		integer2--;
		System.out.println(integer2); // 8

		System.out.println("============");
		int number2 = 8;
		int number3 = 3;
		int sampleNumber = number2 / --number3; // 연산시 number3 는 3으로 연산함.
		// 여기서 부터 number3 는 4가 된다.
		System.out.println(sampleNumber); // 4

		// 대입 연산자 : += , -=
		// 좌항에 우항을 (누적) 대입
		// 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입

		// = : 좌항에 우항을 대입
		int number4 = 10;
		// += : 좌항에 우항을 더한 값을 좌항에 대입
		number4 += 3;
		System.out.println(number4); // 13
		// -= : 좌항에 우항을 뺀 값을 좌항에 대입
		number4 -= 6;
		System.out.println(number4); // 7

		// *= : 좌항에 우항을 곱한 값을 좌항에 대입

		number4 *= 3;
		System.out.println(number4); // 21
		// /= : 좌항에 우항을 나눈 값을 좌항에 대입
		number4 /= 5;
		System.out.println(number4); // 4
		// %= : 좌항에 우항을 나눈 나머지를 좌항에 대입
		number4 %= 3;
		System.out.println(number4); // 1
		System.out.println("============");

		// 대입 연산자의 좌항에는 무조건 변수만 지정할 수 있음
		// 비교연산자
		// 좌항을 우항과 비교한 결과를 논리(false, true) 값으로 반환

		// ==
		// 좌항이 우항과 같다면 true, 아니면 false로 반환
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1); // false

		// !=
		// 좌항이 우항과 다르다면 true, 아니면 false로 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2); // true

		// >, >= GreatThan
		// 좌항이 우항보다 크면 true , 아니면 false로 반환
		// 좌항이 우항보다 크거나 같으면 true, 아니면 false로 반환
		boolean boolean3 = 10 > 10;
		boolean boolean4 = 10 >= 10;
		System.out.println(boolean3); // false
		System.out.println(boolean4); // true

		// <, <= LessThan
		// 좌항이 우항보다 작으면 true, 아니면 false로 반환
		// 좌항이 우항보다 작거나 같으면 true, 아니면 false로 반환
		boolean boolean5 = 8 < 10;
		boolean boolean6 = 8 <= 10;
		System.out.println(boolean5); // true
		System.out.println(boolean6); // true

		System.out.println("============");
		// 논리연산자
		// 논리 값을 연산하는 연산자 , 좌항과 우항 둘다 논리 값이 있어야 한다.

		// && : And 연산
		// 좌항과 우항이 모두 true 일 때 true 를 반환, 아니면 false를 반환
		int number5 = 8;
		int number6 = 3;
		boolean boolean7 = true && true;
		System.out.println(boolean7); // true
		// Ex) boolean7 = (8 < 10) && (7 < 10) ; // true

		// || : OR 연산
		// 좌항 또는 우항중 하나라도 true 일 때 true를 반환, 둘 다 false 일 땐 false를 반환
		boolean boolean8 = false || false;
		System.out.println(boolean8); // false

		boolean boolean9 = 
				(number5 < number6) && (number5 > number6);
		System.out.println(boolean9);
		// (number5 < number6) && (number5++ > number6); => 다음 number5++ 는 그대로 8이다.
		// 왜냐면 앞이 false 라서 뒤에를 읽지를 않는다. 읽을필요가 없기때문이다.
		// 만약 앞에서 ++ 를 붙이고 true 라면 number5 는 9가 된다.
		boolean boolean10 = 
				(number5 > number6) || (number6 > number5++);
		System.out.println(number5); // 8
		// 마찬가지로 || 연산자에서 앞이 true 이기 때문에 뒤에를 읽지 않는다. 그래서 여전히 number5 는 8이다.
		// 앞이 true 인지 false 인지 그리고 연산자가 OR 인지 AND 인지에 구분해야한다.

		// ! : NOT
		// 부정 연산자 , 논리 값의 부정을 반환
		boolean boolean11 = !(number5 > number6);
		System.out.println(boolean11); // false , 원래는 true 이지만 !를 써서 false가 나온다.

		// 삼항 연산자
		// 조건에 따라 다른 결과를 반환하는 연산자
		// 조건(값 자체가 논리인 것) <조건 ? 참일때 결과 : 거짓일때 결과>
		String string1 = 
				number5 > number6 ? "3보다 큽니다." :
				number5 == number6 ? "3입니다." : "3보다 크지 않습니다.";
		// -> if 문으로 바꾸면 
//		if (number5 > number6) {
//			System.out.println("3보다 큽니다.");
//		} else if (number5 == number6) {
//			System.out.println("3입니다.");
//		} else {
//			System.out.println("3보다 크지 않습니다.");
//		}
		System.out.println(string1); // 3보다 큽니다. <참>

	}
}
