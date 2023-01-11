package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		birth.set(2001, 4, 21);
		System.out.println(birth.getTime());
		System.out.println(now.getTime());
		
//		//현재시간에서 분을 1 늘림
//		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
//		System.out.println(sample.getTime());
		
		//★
		//현재시간을 milliseconds로 변환
		long n = now.getTimeInMillis();
		long s = birth.getTimeInMillis();
		//현재시간-생일
		n = n-s;
	
		//★
		//분으로 환산
		// n /(1000*60)
		
		//시간으로 환산
		// n / (1000*60*60)
		
		//하루(day)로 환산
		// n / (1000*60*60*24)
		
		//년도로 환산
		//n = n /(1000*60*60*24);
		//n = n / 365;
		
		//★
		
		n = n /(1000*60*60*24);
		n = n / 365;
		
		System.out.println("n: "+n);
		System.out.println("s: "+s);
	}
}
