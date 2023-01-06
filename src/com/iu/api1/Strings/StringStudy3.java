package com.iu.api1.Strings;

import java.util.Scanner;

public class StringStudy3 {

	public static void main(String[] args) {
		Object object = new Object();
		Scanner sc = new Scanner(System.in);
		//클래스명 변수명 = new 생성자
		//String은 불변
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		
		str1 = str1+"world"+str2+str3+str4;
		//객체 최소 4개 만들어짐
		//권장하지 않는 방법
		
	}

}
