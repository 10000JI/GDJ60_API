package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		//다형성 => 상속관계만 가능
		//Object타입으로 이루어져 있다.
		ar.add(1);	//Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		//모든 것을 다 담을 수 있다(pimitive타입, 참조타입 뭐든)
		
//		int n1 = ar.get(0);
//		double n2 = ar.get(1);
		//Object 타입으로 선언되어 있기에 int, double 타입에 대입할 수 X
		
		int n1 = (Integer)ar.get(0); //Auto-UnBoxing
		double n2 = (Double)ar.get(1); //Auto-UnBoxing
		//int의 참조타입인 Integer type으로 강제타입 변환 
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	}

}
