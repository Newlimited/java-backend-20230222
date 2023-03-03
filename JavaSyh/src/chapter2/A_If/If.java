package chapter2.A_If;

	// if 구문
	// 조건에 따라 실행시키고자 하는 로직이 다를 때 사용하는 구문
	public class If {

		public static void main(String[] args) {
			// 단순 if 문
			// 조건이 true일 때 실행할 코드를 지정하는 구문
			// 사용 방법 : if (조건) { 조건이 true 일 때 실행할 코드 }
			int age = 12;
			if (age > 19) {
				System.out.println("성인입니다.");
			}
			// if 문의 경우 코드 블럭에 오는 실행할 코드가 하나의 구문이면
			// {}를 제거하고 사용 가능

			if (age > 19)
				System.out.println("성인입니다.");
			System.out.println("조건 검사 완료");

			// if - else 문
			// 조건이 true 경우와 false일 경우에 실행되는 코드를 각각 지정하는 구문
			// 사용 방법 : if (조건) { 조건이 true 일 때 실행할 코드 }
			// else { 조건이 false 일 때 실행할 코드}

			if (age > 19) {
				System.out.println("성인입니다.");
			} else {
				System.out.println("미성년자입니다.");
			}

			// if 문과 마찬가지로 else 문도 코드 블럭에 오는 실행할 코드가 하나의 구문일 때
			// {} 중괄호 생략이 가능하다.

			if (age > 19)
				System.out.println("성인입니다.");
			else
				System.out.println("미성년자입니다.");

			// 중첩 if문
			// if 문 혹은 else문의 코드 블럭 안에 if문을 사용
			// 중첩 if는 딱히 좋지 않다....
			if (age <= 19) {
				if (age < 8) {
					System.out.println("미취학 아동입니다.");
				} else {
					System.out.println("청소년입니다.");
				}
			} else {
				System.out.println("성인입니다.");
			}
			if (age > 19) {
				System.out.println("성인입니다.");
			} else if (age < 8) {
				System.out.println("미취학 아동입니다.");
			} else {
				System.out.println("청소년입니다.");
			}
			// if - else if - else 문
			// 중첩 if문의 응용
			// else 문의 코드 블럭에 오는 코드가 한줄일 때 { } 을 제거 할 수 있다.

			if (age > 19)
				System.out.println("성인입니다.");
			else if (age < 8)
				System.out.println("미취학 아동입니다.");
			else
				System.out.println("청소년입니다.");

		}
	}