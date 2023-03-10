package chapter6.A_CollectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Collection Framework
// 배열형태의 데이터를 보다 편하게 사용 할 수 있도록 해주는 클래스

public class CollectionClass {

	public static void main(String[] args) {
		// Set 클래스
		// 집합 - 중복을 허용하지 않고 순서가 없는 형태
		// 값 넣을시 .add(값) 사용
		// 순서가 없기때문에 index로 접근 불가

		// HashSet<E> : 중복을 허용하지 않고 순서가 없는 형태

		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(413);
		integerSet.add(231);
		integerSet.add(452);
		integerSet.add(211);
		integerSet.add(452);

		Iterator<Integer> iterator = integerSet.iterator();

		// hasNext -> boolean으로 적용, 다음값이 있는지 확인
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		for (Integer item : integerSet) {
			System.out.println(item);
		}
		// TreeSet<E> : 중복 x 순서 x + 정렬

		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(485);
		treeSet.add(425);
		treeSet.add(325);
		treeSet.add(85);
		treeSet.add(85);
		treeSet.add(6542);
		treeSet.add(6542);
		treeSet.add(9488);

		for (Integer item : treeSet) {
			System.out.println(item);
			// 85, 325, 425, 485, 6542, 9488
		}
		System.out.println(integerSet);
		System.out.println("=======구분선=======");

		// List
		// 데이터를 일렬로 나열
		// 순서 O 중복 허용(배열)

		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("car");
		list.add("banana");
		list.add("apple");
		list.add(0, "Sinbi"); // 인덱스 , 값 -> 해당인덱스에 지정한 값 넣기
		list.add("아자씨");
		list.add("메롱메롱");

		list.set(0, "Sinb");
		System.out.println(list); // toString() 붙여도된다.
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
			if (list.get(index).equals("Sinb")) {
				System.err.println(list.get(index));
				// 구분을 주기 위해 out이아닌 err를 썻음
			}
		}
		System.out.println("=======구분선=======");
		String removeItem = list.remove(0);
		// 삭제하고 반환해줌// 삭제할 문자를 indexOf로 찾고 , 해당 index를 remove에 넣는다.
		System.out.println(removeItem); // 따라서 삭제 된 것을 보여줌
		System.out.println(list); // 0번 인덱스에 있던것이 삭제 된채로 나옴

		// LinkedList<E> : 순서가 존재하고 중복이 허용된 '배열' +
		// 각 요소가 이전요소와 다음요소의 주소를 같이 가지고 있음
		// 검색 속도가 빠름
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		long startTime = System.currentTimeMillis();
		for (int integer = 0; integer < 100_000; integer++) {
			arrayList.add(0, integer);
		}
		long endTime = System.currentTimeMillis();

		System.out.println("ArrayList 작업시간 : " + (endTime - startTime)); // 56393 정도걸림
		startTime = System.currentTimeMillis();
		for (int integer = 0; integer < 100_000; integer++) {
			linkedList.add(0, integer);
		}
		endTime = System.currentTimeMillis();

		System.out.println("LilnkedList 작업시간 : " + (endTime - startTime)); // 146 걸림

		System.out.println("=========구분선========");
		// Queue , Stack - 입구와 출구가 하나...

		// Map = 키와 값을 쌍으로 저장 , Key 와 Value
		// add 가 아닌 put으로 값을 저장
		// remove 시 key 값을 넣음
		Map<String, String> hashMap = new HashMap();
		// new HashMap<String, String>() 을써도된다. <> 생략가능
		hashMap.put("Key", "Value");
		hashMap.put("사과", "apple");
		hashMap.put("바나나", "banana");
		hashMap.put("메론", "melon");
		hashMap.put("오렌지", "orrange");

		System.out.println(hashMap);

		System.out.println(hashMap.get("메론"));// melon
		// 사실 HashMap 은 좋지않다...
		System.out.println("=========lotto========");
		// Lotto 응용
		// 숫자 6개 , 중복x = > TreeSet
		Set<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() < 6) {
			Random random = new Random();
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		System.out.println(lotto.toString());

	}
}
