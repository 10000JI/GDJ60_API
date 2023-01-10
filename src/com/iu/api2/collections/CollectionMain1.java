package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionMain1 {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		//각각 다른 ArrayList<Integer>타입의 ar1과 ar2를 ArrayList로 연결
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		ars.add(ar1);
		ars.add(ar2);
		
		//ar1의 첫번째 값을 꺼낼때
		ars.get(0).get(0);
		
		ArrayList<ArrayList<ArrayList<Integer>>> arrs = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("ar1", ar1);
		map.put("ar2", ar2);
		
		
	}
}
