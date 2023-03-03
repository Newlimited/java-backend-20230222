package chapter3.B_VariableMethod;

import javax.management.monitor.Monitor;

// 클래스에서의 변수
// 인스턴스변수 : 각각의 인스턴스마다 고유하게 가지고 있어야 하는 속성을 지정할 때 사용
// 클래스변수 : 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야 하는 
// 			 속성을 지정 할 때 사용
// 지역변수 : 메서드 내에서 선언된 변수(인스턴스변수, 클래스변수는 전역변수(글로벌변수))

class GalaxyPhone{
	// 인스턴스변수 : 인스턴스마다 고유하게 가지고 있는 속성
	// 인스턴스변수는 인스턴스가 생성된 후에 사용 가능
	String model;
	String owner;
	String telNumber;
	// 클래스변수 : 해당 클래스로 생성된 모든 인스턴스가 동일하게 가지고 있는 속성
	// static 데이터타입 변수명;
	// 클래스변수는 인스턴스 생성없이 클래스로 사용가능 (인스턴스로 도사용가능)
	static String maker = "SAMSUNG";
	// 만들 때 바로 초기화 해주는게 좋다.
}
class MonitorSize{
	static final int HEIGHT = 1080; // 이거를 사용하려면 인스턴스화를 해야한다. 매번하기 귀찮으므로
	// static을 붙인다.
	static final int WIDTH = 1020;
}

public class VariableMethod {
	// VariableMethod 클래스의 전역변수
	int number = 10; 
	int size = MonitorSize.HEIGHT * MonitorSize.WIDTH; 
	// static으로 쓰면 이렇게 바로 클래스로 불러올수있다.
	
	public static void main(String[] args) {
		// main 메서드의 지역변수
		double decimal = 10.0;
								// 인스턴스를 생성한것.
		GalaxyPhone myS23 = new GalaxyPhone();
		myS23.model = "S23";
		myS23.owner = "홍길동";
		myS23.telNumber = "010-1111-1111";
		
		GalaxyPhone myS22 = new GalaxyPhone();
		myS22.model = "S22";
		myS22.owner = "김철수";
		myS22.telNumber = "010-2222-2222";
		
		System.out.println(myS23.telNumber);
		System.out.println(myS22.telNumber);
		
		myS23.maker = "SAMSUNG";
		
		System.out.println(myS23.maker);
		System.out.println(myS22.maker);
		System.out.println(GalaxyPhone.maker); // 클래스로 접근하면 노란색줄이 안뜬다.

	}
}
