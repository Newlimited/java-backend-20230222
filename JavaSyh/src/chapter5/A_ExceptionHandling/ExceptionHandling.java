package chapter5.A_ExceptionHandling;

import java.util.Scanner;

/* 예외
 * 오류 중 개발자가 예측해서 제어할 수 있는 오류
 * 컴파일 및 로직상의 문제는 없지만 사용자의 입력 혹은 타 프로그램의 결과에서
 * 예상치 못한 값을 받아 처리 할 때 발생 
 * 
 * 시스템 오류 : 개발자가 코드상으로 조취를 취할 수 없는 문제(전원 부족, 메모리 부족)
 * 컴파일 에러 : 컴파일이 불가능한 상태 (오타, 참조타입 불일치 ...)
 * 런타임 에러 : 프로그램이 실행 도중 발생하는 문제 
 * 				(빌드 실패, 포트 중복, 데이터베이스 연결실패...)
 * 로직 에러 : 프로그램의 아웃풋이 예상과 다르게 나오는 문제
 * 예외 : 정상적인 입력에서는 정상 처리가 되지만 비정상 적인 입력에서는 처리가 되지 않는문제
 * 		(null 값 참조, 로직 실행 중 데이터 베이스 연결 실패...)
 */
public class ExceptionHandling {
	// throws 예외 클래스 : 해당 예외를 호출 부로 책임을 전가
	// throws가 선언부에 추가도니 메서드를 호출하는 곳에서
	// 예외처리에 대한 강제성이 부여됨
	private static void bringException() throws Exception // (예외이름)
	{
		Exception exception = new Exception("예외 던지가 발생!");
		throw exception;
	}

	public static void main(String[] args) {

		// 예외 상황

//		Scanner scanner = null;
//		scanner.nextLine(); -- NullPointerException

//		int[] numbers = {1, 2, 3};
//		System.out.println(numbers[4]); --ArrayIndexOutOfBoundsException

		// 예외 처리
		// 예외를 예상하고 그 상황에 대해서 적절한 대처를 해주는 것
		// 가장 좋은 것 (예외가 발생하지 않도록 하는 것)

		// try - catch 문으로 예외 잡기
		// try 구문에 예외가 발생 할 수 있는 문장을 작성
		// catch 구문에 해당 예외 상황에 대한 대처 구문을 작성

		// 사용 방법
		// try { 예외가 발생 할 수 있는 문장}
		// catch (예외타입 예외참조변수){ 예외가 발생했을 때 처리할 문장}
		Scanner scanner = null;

		try {
			int number = scanner.nextInt();
		} catch (NullPointerException exception) {
			// 어떤예외인지 명시해주는것이 좋지만 불가능할 경우 Exception으로 처리
			// RuntimeException 을 써도됨 -> 기본적으로 RuntimeException 을 상속 받고있기 때문에...
			// 또한 RuntimeException 또한 Exception을 상속 받고 있다. 따라서
			// Exception 으로 써도 된다. Throwable --> 모든 에러.
			System.out.println("Null Pointer Exception 발생!");
		}
		try {// Exception Class로 예외 생성
			Exception exception = new Exception("고의 예외!");
			// throw로 예외를 강제로 발생 시킴
			throw exception;
		} catch (Exception exception) {
			exception.printStackTrace(); // 예외발생지점을 알려줌.
		}
		// 예외 던지기 - 예외 처리부분을 미룸 - 해당 메서드에서 처리하도록 함
		try {
			bringException();
		} catch (Exception e) {
			e.printStackTrace();
		} //예외처리의 강제성이 부여됨
	}
}
