package chapter4.A_AccessModifier;

// 접근 제어자
// 멤버 또는 클래스의 접근 권한을 제한 해주는 제어자
// private : 같은 클래스 내에서만 접근 가능
// default : 같은 패키지 내에서만 접근 가능
// protect : 같은 패키지 내에서 그리고 다른패키지의 자손클래스에서 접근이 가능
// public  : 모든 곳에서 접근이 가능

// 클래스 , 멤버변수, 메서드, 생성자에서 사용
public class Example4 {
	int number4; // default 이므로 다른 패키지에서 사용 불가

	private void function4() {
	} // private라서 타 클래스에서 사용불가

	private Example4() {// 생성자에 private 붙이기

	}
}