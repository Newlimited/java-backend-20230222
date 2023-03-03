package chapter3.B_VariableMethod;

class Triangle {
	double underSide;
	double height;
	double hypotenuse;

	double area;
	double circumference;

}

class TriangleMath {

	// 파라미터로 참조변수를 받는다면 메모리 주소가 복사되어 넘어오기 때문에
	// 실제 작업도 해당 메모리 주소에서 작업을 진행함
	// 실제 데이터가 변경됨
	static void setArea(Triangle triangle) {
		double area = triangle.underSide * triangle.height * 0.5;
		triangle.area = area; // 스택에서 메모리가 생성되었다가 메서드가 끝나면 같이사라짐.
	}

	static void setHypotenuse(Triangle triangle) {
		double squareHypoenuse = Math.pow(triangle.underSide, 2) + Math.pow(triangle.height, 2);
		// pow = 제곱 , sqrt = 제곱근
		double hypotenuse = Math.sqrt(squareHypoenuse);
		triangle.hypotenuse = hypotenuse;
	}

	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.height + triangle.underSide + triangle.hypotenuse;
	}

	static Triangle createTriangle(double underSide, double height) {
		Triangle triangle = new Triangle(); // 힙에서 생성이되고 함수가 종료되더라도 메모리공간이 없어지지않음.
		triangle.underSide = underSide;
		triangle.height = height;
		setHypotenuse(triangle);
		setArea(triangle);
		setCircumference(triangle);

		return triangle;

	}
}

public class Method2 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.underSide = 3;
		triangle1.height = 4;
		triangle1.hypotenuse = 5;

		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);

		Triangle triangle2 = TriangleMath.createTriangle(5, 5);
		System.out.println(triangle2.area);
	}

}
