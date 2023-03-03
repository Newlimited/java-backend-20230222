package chapter1.E_Array;

// 배열

// '같은 타입' 의 변수가 나열된 형태
// 배열은 '생성'해서 사용함 => 생성해서 사용하는 변수 : 참조 변수
// new 연산자로 생성 할 수 있음
// 배열은 실제 데이터가 저장되는 것이 아니라 
// 데이터 배열이 저장된 첫 번째 메모리 주소가 저장됨

public class Array {
	public static void main(String[] args) {
		// 동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		int score1, score2, score3, score4, score5;
		score1 = 90;
		score2 = 100;
		score3 = 70;
		// 위 방식의 문제점
		// 관리가 어려움, 특정 조건에 따른 데이터를 가져오기 힘듬

		// 배열
		// 동일한 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태
		// 선언 방법: 데이터타입[] 배열명 ;
		int[] scores;
		// 생성 방법: 배열명 = new 데이터타입[배열의 길이];
		scores = new int[5];
		System.out.println(scores);
		// 초기화 방법 : 배열명[인덱스번호] = 데이터;
		// 인덱스는 0부터 시작
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 95;
		scores[3] = 75;
		scores[4] = 50;
//		scores[5] = 50; // ArrayIndexOutOfBoundsException 나중에 예외처리때 사용

		// 선언과 동시에 생성 및 초기화
		// 1. 데이터타입[] 배열명 = new 데이터타입[]{요소1, 요소2 ...}
		// 1. 데이터타입[] 배열명 = {요소1, 요소2 ...}

//		int[] scoreList = new int[] { 1, 2, 3, 4 };
		int[] scoreList = { 1, 2, 3 };
		System.out.println(scoreList.length); // 3이나온다.
		char[] string = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(string);
		string[0] = 'k';
		System.out.println(string);
		System.out.println(string[0]);
		
		// 다차원 배열
		// 선언 방법: 데이터타입 [][] 배열명;
		// 생성 방법: 배열명 new 데이터타임[첫번째 배열 길이][두번째 배열 길이];
		// 선언과 동시에 초기화
		// 1. 데이터타임[][] 배열명 = new 데이터타입[][] {{요소11, 요소12...},{요소21, 요소22...}...};
		
		// scoreList = {1,2,3}
		int[] extraScoreList = scoreList; // 메모리 주소가 넘어감

		System.out.println(scoreList);
		System.out.println(extraScoreList);
		extraScoreList[0] = 70 ; // 여기서 0 번째 인덱스에서 값을 바꾸게 되면 scoreList도 바뀜
		
		System.out.println(scoreList[0]);
	}
}
