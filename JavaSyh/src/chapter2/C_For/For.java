package chapter2.C_For;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// for 반복문
// 규칙이 있는 작업을 반복하는 제어문
// 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문
public class For {

	public static void main(String[] args) {
		// 반복문을 사용하는 이유
		// 길이가 5인 int 타입의 배열(intArray5)을 선언 및 생성
		int[] intArray5 = new int[5];
		// intArray5의 각 인덱스를 1~5 까지 값으로초기화
		intArray5[0] = 1;
		intArray5[1] = 2;
		intArray5[2] = 3;
		intArray5[3] = 4;
		intArray5[4] = 5;

		// for 반복문
		// 특정한 변수가 증감하며 조건에 부합하는 동안 반복하는 반복문
		// 사용방법 :
		// for (변수 선언 혹은 초기화; 조건; 증감식) {실행할 코드}
		
		// 변수 선언 혹은 초기화: 반복문을 위해 사용할 변수를 선언혹은 초기화
		// 조건 : 반복을 계속하기 위한 조건, true 이면 반복 , false 면 종료
		// 실행할 코드 : 조건이 true 일 때 실행할 코드
				
		for (int index = 0; index < intArray5.length; index++) 
			intArray5[index] = index + 1;
		//for 문의 경우 코드 블럭에 오는 실행할 코드가 한 구문이면 
		//{}를 제거 할 수 이다.
		System.out.println(Arrays.toString(intArray5));

		// foreach 반복문
		// 배열의 요소값을 직접 읽고자 할 때 배열을 반복하면서
		// 요소를 하나씩 복사해서 사용 할 수 있으ㅁ.
		// for( 배열요소의 데이터 타입 변수명 : 배열){ 실행 할 코드 }
		
//		System.out.println(intArray5[0]);
//		System.out.println(intArray5[1]);
//		System.out.println(intArray5[2]);
//		System.out.println(intArray5[3]);
//		System.out.println(intArray5[4]);
		
		System.out.println("=====일반 for 문=====");
		for(int index = 0; index < intArray5.length; index++) {
			System.out.println(intArray5[index]);
			intArray5[index] = 10;
			// 배열의 값을 변경하고자 할 때는 for문을 사용한다.
		}
		for (int number: intArray5) System.out.println(number);
		
		System.out.println("===== foreach 문=====");
		for (int index = 0; index < intArray5.length; index++)
			intArray5[index] = index + 1;
		
		for(int number : intArray5) { 
			System.out.println(number);
			number = 10 ;
		}
		// 직접 변경이 되는것이 아니라 복사된것이 변경되는것. 
		// foreach는 배열안에 값들을 직접 꺼내서 읽고자 할 때 사용한다. 
		// 배열의 값을 그냥 읽기만 한다. 배열의 값을 직접 변경하고자 할 때는 
		// foreach를 사용하는것이 아닌 for를 사용한다.
		
		for (int number : intArray5) System.out.println(number);
	}
	

}

