package chapter1.C_DataType;


// 데이터 타입 
// 각각의 데이터들은 자바에서 지정한 여러 종류의 타입이 존재
// 기본적으로 정수형, 실수형, 문자형, 논리형이 존재
// 추가적으로 참조형 데이터 타입

// 일반적으로 특정한 데이터 타입으로 정의된 변수 혹은 상수는
// 같은 데이터 타입의 데이터로만 연산이 가능.
public class DataType {

	public static void main(String[] args) {
		// 정수 타입
		// byte type
		// 1 byte ( -128 ~ 127) 크기의 데이터를 가질 수 있는 데이터 타입
		byte byte1 = 127; // 128을 넣으면 오류가 뜬다.
		
		// short type
		// 2 byte (-32,796 ~ -32,767) 크기의 데이터를 가질 수 있는 데이터 타입
		short short1 = 32767; // 마찬가지로 32,768은 안된다.
			
		// int type 
		// 4 byte (- 21억 4천 ~ 21 억 4천) 크기의 데이터를 가질 수 있는 데이터 타입
		int int1 = 2_147_483_647; 
	
		// long type
		// 8 byte (-2^63 ~2^63 - 1) 크기의 데이터를 가질 수 있는 정수형
		// 정수타입의 리터럴 상수의 데이터 타입은 int 이기 때문에
		// long 타입의 리터럴 상수를 지정할 땐 리터럴 상수 뒤에 L을 붙여줌
		long long1 = 12_147_483_647L; // 뒤에 소문자 혹은 대문자 L 을 붙여줘야 한다.
		
		// 실수 타입
		// float type
		// 4 byte (1.4 * 10 ^-45 ~ 4.3 * 10^38) 
		// 크기의 데이터를 가질 수 있는 실수형 데이터 타입
		float float1 = 3.14F; //실수의 데이터 타입은 double이다. 그래서 F를 붙여준다.
		// float => 소수점 6자리에서 오차가 발생
		
		// double type
		// 8 byte( 4.9 * 10^-324 ~ 1.8 * 10^308) 크기의 데이터를 가질 수 있는 실수형
		double double1 = 3.1415;
		// double 은 소수점 15 자리에서 오차가 발생
		
		// 문자 타입
		
		// char type
		// 2 byte ( 0 ~ 65,535) 크기의 데이터를 가질 수 있는 문자형 데이터 타입.
		// 문자 ( 단어가아님!) 문자 하나를 저장 할 수 있는 공간
		// 한 문자를 표기 할 땐 ' ' 으로 묶어서 표기
		char char1 = 'a';
		char char2 = 97;
		
		// 논리 타입
		
		// boolean type
		// 1 byte (false 0 , true 1 ) 크기의 데이터를 가질 수 있는 논리형 데이터 타입
		boolean boolean1 = true;
		boolean1 = false;
		// is** , has** 를 많이 덧붙여 씀 , flag => 값만 주겟다 할때 씀  
		
		// 형 변환 (type casting)
		// 자동 형 변환 (묵시적 형 변환) UpCasting
		// 차지하는 범위가 작은 데이터 타입은 범위가 큰 데이터 타입으로 자동 형변환 됨. 업 캐스팅 
		short short2 = 1;
		int int2 = short2;
		char char3 = 1;
//		short2 = char3;
//		char3 = short2; 같은 byte 라 하더라도 하나는 문자형 하나는 정수형 이다. 범위 형태가 다르다.
//		float float2 = 3.14F;
//		int2 = float2; 불가능
		
		
		// 강제 형 변환 (명시적 형 변환) DownCasting
		// 차지하는 범위가 큰 데이터 타입은 범위가 작은 데이터타입으로 대입할 때
		// 형변환을 명시해줘야 한다.
		// 강제 형변환의 경우 overflow (범위 초과)가 발생할 수 있음
		short2 = (short) int2;
		
		//참조형 데이터타입
		// 기본 데이터 타입이 아닌 메모리 주소를 참조하는 데이텅 타입
		// 클래스 
		// 기본 데이터 타입과 다르게 첫문자가 대문자로 시작됨
		// 대표적인 참조형 데이터 타입 : String 
		// String은 문자열을 담을 수 있는 참조형 데이터타입
		String string1 = "This is Comment";
			
	}
}