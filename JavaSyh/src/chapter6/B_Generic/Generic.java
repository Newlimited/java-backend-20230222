package chapter6.B_Generic;

// 제너릭
// 다양한 타입을 다루는 메서드나 클래스에 컴파일 시, 타입을 체크하는 기능
// 컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음

class GenericClass<E> {

	boolean status;
	String message;
	E data;

	static <E> GenericClass<E> getInstance(boolean status, String message, E data) {
		GenericClass<E> instance = new GenericClass();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance; // 타입변수
	}
}
class Generic{

	public static void main(String[] args) {
		GenericClass<Integer> generic1 = new GenericClass();
		GenericClass<String> generic2 = new GenericClass();
//		generic1.data = "String"; // 불가능
		generic2.data = "String";

		GenericClass<?> generic3 = GenericClass.getInstance(false, "message", "Striiing");
	System.out.println(generic3.toString());

	}

}