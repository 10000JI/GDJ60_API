package com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {
	public static void main(String[] args) {
		//Map: Key와 Value로 구성, 순서가 유지 X, Key 중복 X, Value 중복 허용
		HashMap<String, String> map = new HashMap<>();
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2Re");
		
		//key값으로 데이터 조회 (value값)
		String v = map.get("k3");
		
		//해당 key의 value값 삭제
		v = map.remove("k2");
		
		//Key가 Map에 있으면 true, 없으면 false
		boolean check = map.containsKey("v1");
		System.out.println(check);
		
		//반복
		//1. Key들의 정보를 알아야 함
		//	 Key들을 Set으로 변환
		//	 Set을 Iterator로 변환
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : "+key);
			String value = map.get(key);
			System.out.println("Value: "+value);
		}
		
		//전체삭제
		map.clear();
		
		//순서가 없기 때문에 끼워넣거나 별도의 수정 불가능
		System.out.println(v);
		System.out.println(map);
		//주소의 값이 나오는 것이 아니라
		//toString이 자동 호출
		//값이 나온다.
	}
}
