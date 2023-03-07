package chapter4.B_Polymorphism;

// 다형성
// 조상 클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하는것
// 참조변수의 형변환

class SuperClass {
	int number1;
	int number2;

	public SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	void method1() {
	}

	void method2() {
	}
}

class SubClass1 extends SuperClass {
	int number3;

	public SubClass1(int number1, int number2, int number3) {
		super(number1, number2);
		this.number3 = number3;
	}

	void method3() {
	}
}

class SubClass2 extends SuperClass {

	public SubClass2(int number1, int number2) {
		super(number1, number2);
	}
	void method1() {
		System.out.println("Override!!");
	}
}

public class Polymorphism {
	public static void main(String[] args) {

		SuperClass superClass = new SuperClass(1, 2);
		SubClass1 subClass1 = new SubClass1(11, 22, 33);
		SubClass2 subClass2 = new SubClass2(111, 222);

		// 자손 타입 -> 조상 타입 (Up casting) 묵시적 형변환 // 자동형변환
		SuperClass super1 = subClass1;
		SuperClass super2 = subClass2;
		
		System.out.println(subClass1.number3);
		// 참조변수의 형변환을 해도 데이터는 사라지지 않고 
		// 단지 사용 범위만 줄어드는것.
		SubClass1 sub1 = (SubClass1) super1;
		System.out.println(subClass1);
		System.out.println(super1);
		System.out.println(sub1);
		
		System.out.println(sub1.number3);
		super1.method1();
		subClass2.method1();
		// 조상 타입 -> 자손타입 (Down casting) : 명시적 형변환 // 자동 형변환 불가능
//		SubClass1 sub1 = (SubClass1) superClass;
//		SubClass2 sub2 = (SubClass2) superClass;
		
		
	}
}
