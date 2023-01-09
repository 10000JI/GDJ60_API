package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class JuminCheck {
	//check1
	//주민등록번호를 받아서 
	//남자인지 여자인지 출력
	
	//check2
	//주민등록번호를 받아서
	//나이를 계산해서 출력 (올해 - 태어난 년)
	//3-5월: 봄
	//6-8월: 여름
	//9-11월: 가을
	//12-2월: 겨울
	private String jumin;
	
	public JuminCheck(String jumin) {
		this.jumin = jumin;
	}
	
	public void check1() {
		int num = Integer.parseInt(jumin.substring(7,8));
		//jumin.charAt(7)
		System.out.println(num);
		if(num==9||num==1||num==3) {
			System.out.println("남자입니다.");
		}else if(num==0||num==2||num==4) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}
//		if(num%2==1) {
//			
//		}else {
//			
//		}
	}
	
	public void check2() {
		//1. 나이계산
		//991223-1234567 -> 앞에 두개 꺼내야 됨
		String y = jumin.substring(0,2);
		String check = jumin.substring(7,8);
		int year = 1900;
		if(check.equals("3")||check.equals("4")) {
			year = 2000;
		}
		year = year+Integer.parseInt(y);
		int age = 2023-year;
		System.out.println("나이: "+age);
		
		//2.태어난 계절
		//991223-1234567 -> 앞에 3,4번째 꺼내야 됨
		String m = jumin.substring(2,4);
		int month = Integer.parseInt(m);
		if(month>=1 && month<=5) {
			System.out.println("봄");
		}else if(month>=6&&month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		if (m.substring(0,1).equals("0")) {
			m = jumin.substring(3,4);
		}
	}
}
