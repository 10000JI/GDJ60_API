package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain3 {
	public static void main(String[] args) {
		//현재시간에서 3일 후 출력
		
		//현재시간
		Calendar ca = Calendar.getInstance();
		//만약 달의 30일이라면.. 달이 넘어가는 것까지 확인
		ca.set(Calendar.DATE, 30);
		
		//3일 후
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.DATE, 30);
		
		//ex0-0)
		//ca2.add(Calendar.DATE, 3);
		
		//ex0-1)
		//달과 요일이 넘어가지 않음
		ca2.roll(Calendar.DATE, 3);
		
		//-> add와 roll의 차이점
		
		//ex1)
		//ca2.set(Calendar.DATE, ca.get(Calendar.DATE)+3);
		
		//ex2)
		//long d = 1000*60*60*24*3;
		//ca2.setTimeInMillis(ca2.getTimeInMillis()+d);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
	}
}
