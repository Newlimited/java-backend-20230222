package chapter2.D_While;

// while 반복문
// 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문
public class While {

	public static void main(String[] args) {
		// while 문
		// 조건을 검사 하고 해당 조건이 true일 경우 코드 블럭을 실행하는 반복문
		// if문의 반복문 형태
		// 반복 실행 할 코드 블럭이 종료되면 조건을 다시 검사하고
		// true 면 반복 ,false 면 탈출
		// 사용 방법 : while (조건) { 실행 코드 }
		int number = 0;

		while (true) {
			// continue : continue문을 만나면 코드블럭내에서 아래에 오는
			// 모든 코드를 무시하고 다시 조건을 검사
			// 일반적으로 continue문은 조건문과 함께 쓰인다
			// ! 조건문의 코드블럭 내에 해당 변수를 병경시켜주는 코드가 존재해야한다
			if ((number % 2) == 0) {
				number++;
				continue;
			}
			System.out.println(number);
			number++;
			// while 문에서는 조건에 사용되는 변수가
			// 필수로 실행코드 내에서 변경이 이루어 져야함
			// break; 반복문의 코드블럭을 강제로 종료 시킬때 사용
			if (number == 200)	break;
		}
			// 일반적으로 break문은 조건문과 함께 사용된다
		
		// number = 200

		// do - while
		// 반복실행할 코드를 무조건 한번 실행 할 수에 조건을 검사하는 반복문
		// 사용 방법 : do{실행할 코드} while (조건) ;
		System.out.println();
		do {
			System.out.println(number);
		} while (number < 200);
		System.out.println(number);
	}

}