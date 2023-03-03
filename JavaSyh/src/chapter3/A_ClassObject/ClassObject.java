package chapter3.A_ClassObject;

// class
// 객체를 정의해 놓은 것
// 객체를 생성하는 기반
// 객체를 정의하는 틀 또는 설계도

// 클래스는 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메소드로 구성됨
// 필드: 클래스에 포함된 변수 혹은 상수
// Method : 어떠한 특정 작업을 수행하기 위한 명령문의 집합

// 객체 : Object 
// 실제로 존재하는 모든 것들
// 클래스로 생성된 실체

// 클래스로 생성된 각각의 객체는 독립적으로 존재함
// 같은 클래스로 생성된 객체라 하더라도 
// 각각이 가지고 있는 '속성 값'은 다를 수 있음( 일반적으로 다름 )

// 클래스 선언 방법
// class 클래스명 {속성1; 속성2; 속성3; .... , 기능1{} 기능2 {} ...}
// 속성 : 변수 , 특성, 필드 ,상태
// 기능 : Method(메서드), 함수 ,행위

// 클래스 명은 UpperCamelCase 명명 규칙을 따름
class SmartPhone {
	// 기종
	String modelName;
	// 색상
	String color;
	// 메모리
	int memory;
	// 전화번호
	String telNumber;
	// 전원
	boolean power;

	// 전화 걸기
	void call(String toTelNumber) {
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}

	// 영상 시청
	void showVideo(String program) {
		System.out.println(program + "를 시청합니다.");
	}

	// 메세지
	void sendMessage(String message, String toTelNumber) {
		System.out.println(toTelNumber + "로 " + message + "라고 메세지를 보냅니다.");
	}

	// 전원켜고 끄기
	void setPower() {
		power = !power;

	}
}

public class ClassObject {

	public static void main(String[] args) {
		// Instance 인스턴스
		// 특정 클래스로 생성된 객체를 '인스턴스' 라고 함
		// 클래스로 객체를 생성하는 행위를 '인스턴스화' 라고 함
		
		// 인스턴스 선언 방법
		// 클래스 참조면수명(인스턴스명)
		SmartPhone iPhone14;
		// 인스턴스 생성 방법
		// 참조변수명 = new 클래스명();
		iPhone14 = new SmartPhone();
		SmartPhone iPhone14Pro = new SmartPhone();
		// 배열은 같은타입 , 클래스는 다른 타입들이 섞여있는 집합

		// 인스턴스의 속성 적근 및 기능 사용
		// 속성 접근 : 참조변수.멤버변수;
		// 기능 사용: 참조변수.메서드([매게변수]);
		iPhone14.modelName = "IPhone14";
		iPhone14.color = "Black";
		iPhone14.memory = 512;
		iPhone14.telNumber = "010-1111-1234";
		iPhone14.power = false;
		
		System.out.println(iPhone14.modelName);
		System.out.println(iPhone14.telNumber);
		
		System.out.println(iPhone14Pro.modelName);
		System.out.println(iPhone14Pro.memory);
		System.out.println(iPhone14Pro.power);
		// 참조형 클래스는 위치를 바라봄 - > 지정하지 않으면 위치를 지정하지않았다 해서 'null' 이 들어감
		// 일반 클래스는 모두 0 으로 초기화가 기본으로 되어있음. 그래서 0 혹은 false 로 냐옴
		
//		SmartPhone galaxy = null;
//		System.out.println(galaxy.color);
		// 공간은 있다(SmartPhone) 다만 위치가 없다. 
		
		iPhone14.call("010-1234-1234");
		iPhone14.showVideo("Youtube");
		System.out.println(iPhone14.power);
		iPhone14.setPower();
		System.out.println(iPhone14.power);
		
		iPhone14Pro = iPhone14; // 14의 정보를 14Pro에 넣는다.
		iPhone14Pro.telNumber = "010-9999-9999";
		System.out.println(iPhone14.telNumber);
		
		// 객체배열
		// 클래스명[] 객체배열명 = new 클래스명[길이];
		SmartPhone[] smartPhoneList = new SmartPhone[3];
		smartPhoneList[0] = iPhone14;
		smartPhoneList[1] = iPhone14Pro;
		smartPhoneList[2] = new SmartPhone();
		
		
		for(int index = 0; index < smartPhoneList.length; index++){
			SmartPhone smartPhone = new SmartPhone();
			smartPhone.telNumber = "010-1111-111" + index;
			smartPhoneList[index] = smartPhone;
		} // smartPhone의 주소를 smartPhoneList에 넣엇기 때문에 3개의 인덱스가
		// 같은 주소를 가진다 따라서 폰넘버를 하나만 바꿔도 세개가 전부 바뀐다.
		// 전부 각자 주소를 바꾸게 되면 각자의 번호를 가지게 된다.
		for(SmartPhone phone : smartPhoneList) {
			System.out.println(phone.telNumber);
			System.out.println(phone);
			}
	}
}
