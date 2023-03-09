package chapter5.B_ApiClass;

import java.util.Scanner;

// API Class
// Java 자체에서 제공하여 개발에 도움을 주는 각종 라이브러리
public class ApiClass {
	public static void main(String[] args) {

		// Object class
		// 모든 class의 조상 class
		Object object = new Scanner(System.in);
		object = new int[10];

		// String class
		// 문자열 처리에 대한 메서드가 정의되어 있는 클래스
		String string = " This is String contents ";
		
		// .substring(시작 인덱스 ,종료인덱스);
		String subString = string.substring(6,8);
		System.out.println(subString);
		
		// .length()
		// 문자열 가져오는 메서드
		
		// .toUpperCase() 
		// 모든 문자를 대문자로 교체
		// .toLowerCase()
		// 모든 문자를 소문자로 교체
		
		String upperCase = string.toUpperCase();
		String lowerCase = string.toLowerCase();
		System.out.println(upperCase);
		System.out.println(lowerCase);

		// .indexOf(문자열);
		// 해당하는문자열이존재한다면 그 위치의 첫번째 index 번호를 반환해주는 메서드
		int stringIndex =string.indexOf("is");
		System.out.println(stringIndex); // 없으면 -1 이나온다
	}
}
