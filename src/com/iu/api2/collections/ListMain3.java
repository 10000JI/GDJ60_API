package com.iu.api2.collections;

import java.nio.file.WatchEvent;
import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다.
		//<>=Generic: 타입의 안전성
		//E: 변수명, 참조타입만 넣을 수 있다.(Object타입)
		//따라서 int(x) Integer(o)
		//E=Integer
		//뒷부분 <>은 생략 가능
		//ar의 메소드 사용시 매개변수는 int타입, 혹은 Integer타입만 사용가능
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		int num = ar.get(0);
		System.out.println(num);
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Seoul");
		ar2.add(weatherDTO);
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Jeju");
		ar2.add(weatherDTO);
		
//		weatherDTO = new WeatherDTO();
//		weatherDTO.setCity("Jeju");
//		ar2.remove(weatherDTO);
//		//주소가 들어있는 것을 지우는 것
//		//일치하는게 없어 지워지지 X
	
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i).getCity());	
		}
	}
}
