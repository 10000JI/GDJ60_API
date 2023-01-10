package com.iu.api2.collections.sample;

import java.util.ArrayList;

public class CollectionMain {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Parent parent = new Parent();
		//child1과 child2를 모두 받아내는 ArrayList
		//(동일한 요소가 들어가야됨)
		//★★★★★★★
		ArrayList<Parent> ar = new ArrayList<>();
		ar.add(child1);
		ar.add(child2);
		//★★★★★★★
		
//		//ar의 모든 타입이 Child1은 아니다. 강제타입변환
		Child1 ch1 = (Child1)ar.get(0);
		
		//ar의 0번의 값이 Child1의 값입니까?
		System.out.println(ar.get(0) instanceof Child1);
		
		//Parent를 상속받은 타입을 받겠다 (아래)
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		//Parent타입과 Parent의 부모타입을 받겠다. (위)
		ArrayList<? super Parent> ar3 = new ArrayList<>();

	}
}
