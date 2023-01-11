package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		//여기도 toString이 오버라이딩하여 처리가 되어있다(Object 상속됨)
		System.out.println(ca);
		
		//set으로 변경
		//2032년 12월
		ca.set(Calendar.YEAR, 2032);
		//월은 0부터 시작이므로 12월 만든다면 11로 set
		ca.set(Calendar.MONTH, 11);
		
		//year
		int year = ca.get(Calendar.YEAR);
		//month, 월은 0부터 시작
		int month = ca.get(Calendar.MONTH);
		//일
		int date = ca.get(Calendar.DATE);
		//요일
		//일월화수목금토
		//1234567
		int day = ca.get(Calendar.DAY_OF_WEEK);
		int h = ca.get(Calendar.HOUR);
		int m = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		System.out.println("Year:"+year);
		//산술연산을 위해 ()로 사용("Month"에서 연결연산됨)
		System.out.println("Month:"+(month+1));
		System.out.println("Date:"+date);
		System.out.println("Day:"+day);
		System.out.println("Hour:"+h);
		System.out.println("Minute:"+m);
		System.out.println("Seound:"+s);
	}

}
