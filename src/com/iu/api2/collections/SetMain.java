package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		//set: 순서유지x, 중복허용 x, get x
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		//중복허용X
		hs.add(2);
		hs.remove(1);
		//인덱스번호 x, 해당 값을 삭제
		
//		System.out.println(hs); //주소가 아니라 값이 나온다.
//		// = toString() 메소드 호출과 동일
		System.out.println(hs.toString());
		System.out.println(hs.size());
		
		//Set의 Data들을 Iterator 형식으로 변경
		//다형성
		//변수 선언
		Iterator<Integer> is = hs.iterator();
		while(is.hasNext()) {
			Integer num = is.next();
			//auto-box로 int형으로 선언도 가능
			System.out.println(num);
		}
	}

}
