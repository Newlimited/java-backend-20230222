package chapter3.E_Inheritance;

/*
 * 상속 Inheritance
 * 기존 클래스를 재사용해서 새로운 클래스르 작성하는 것
 * 코드의 재사용성을 높이고 코드의 중복을 제거해줌 -> 생산성이 향상, 유지보수성이 향상
 * 
 * 사용 방법
 * class 클래스명 extends 조상클래스{...}
 */
class Human {
	String name;
	int age;
	String telNumber;
	String country;

	Human() {
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.telNumber = "010-1111-2222";
		this.country = "korea";
	}

	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");

	}
}

// Develop 클래스는 Human의 속성과 기능을 모두 사용가능
class Developer extends Human {
	String position;
	String language;

	Developer() {
	}

	Developer(String name, int age, String position, String language) {
		// super부모 클래스를 지칭한다.
		// super() : 부모 클래스의 생성자 지칭
		super(name, age);
		this.position = position;
		this.language = language;

	}

	void develop() { // 상속을 받았기 때문에 name 이 이미 인스턴스화 되어있다. this 도 가능, super도 가능
		System.out.println(super.name + "가 " + this.language + "로 " + this.position + " 개발을 합니다.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Developer developer1 = new Developer();
		developer1.name = "john doe";
		developer1.position = " back end";
		developer1.language = "java";

		developer1.eat("사과");
		developer1.develop();

		Developer developer2 = new Developer("Michle", 29, "Front end", "Javascript");
		developer2.eat("바나나");
		developer2.develop();
	}
}
