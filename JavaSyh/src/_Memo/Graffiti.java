package _Memo;

import java.util.Random;
import java.util.Scanner;

//class Ex{
//	int num;
//	String string;
//	
//	Ex(){
//		num = 10;
//		string = "String";
		// num 과 String 을 내부에서 초기화 하지말고 , 밖에서 초기화할
		// 값을 넣어줘라 -> 외부에서 값 주입  ==> 의존성역주입
//	}
//}
public class Graffiti {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[45];
		
		for(int index = 1; index < lotto.length; index++) {
			lotto[index] = index;
		}
		for(int index = 0; index < 6; index++) {
			int lottoNumber = random.nextInt(6);
			System.out.println(lottoNumber);
		}
	}
}
