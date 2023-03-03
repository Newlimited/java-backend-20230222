package chapter3.D_Constructor;

/* Constructor 생성자
 *  인스턴스가 생성될 때 호출되는 인스턴스 '초기화 메서드'
 *  인스턴스 변수의 초기화 작업에 사용
 *  인스턴스 생성시에 실행되어야 할 작업을 작성 하는 위치
 *  
 *  Conditions of Constructor
 *  생성자의 이름은 해당 클래스명과 같아야함
 *  생성자는 반환값이 없음  
 */
class Circle {
	double radius;
	double diameter;
	double circumference;
	double area;

	/*
	 * Using of Constructor 
	 * 클래스명([파라미터,[...]]){ 인스턴스 생성시 실행할 코드} 
	 */
	Circle(double radius) { // RequiredArgsConstructor
		System.out.println("Circle이 생성됩니다.");
		// this: 인스턴스 자신
		this.radius = radius;
		this.diameter = 2 * radius;
		this.circumference = 3.14 * 2 * radius;
		this.area = 3.14 * radius * radius;
	}
	// 생성자도 메서드이기 때문에 오버로딩을 적용해서
	// 매개변수에 따라 다른 작업을 수행할 수 있음
	Circle(){
		System.out.println("빈 생성자 입니다.");
		this.radius = 10;
		this.diameter = 2 * this.radius;
		this.circumference = 3.14 * this.diameter;
		this.area = 3.14 * this.radius * this.radius;
// 아무 매개변수를 적지 않으면 기본적으로 이렇게 생성된다 -- > 기본생성자 - > noArgsConstructor
	}
	
	// 생성자를 이용한 인스턴스 복사
	Circle(Circle circle){
		System.out.println("복사한 생성자");
		this.radius = circle.radius;
		this.diameter = circle.diameter;
		this.circumference = circle.circumference;
		this.area = circle.area;
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		System.out.println("=====생성자=====");
		Circle circle1 = new Circle(); // Circle() = 생성시 초기화 해주는 메서드
		Circle circle2 = new Circle(5);
		Circle circle3 = new Circle(circle1);
		System.out.println("=====생성자=====");
		System.out.println(circle1.radius); // 윗줄에서 초기화를 시켯기 떄문에 0으로 뜬다.
		// 지금은 생성자에서 직접 10 으로 반지름의 값을 주었기 때문에 10으로 뜬다
		System.out.println(circle1.area);
		System.out.println(circle2.area);
		
//		double radius;
//		System.out.println(radius); 
//		이것은 초기화가 되어잇지 않은 radius 이므로 에러

	}
}