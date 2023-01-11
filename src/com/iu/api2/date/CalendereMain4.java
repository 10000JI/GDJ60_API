package com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendereMain4 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2023년 1월 11일 => format
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		sd.applyPattern("yyyy-MM-dd-E");
		String p = sd.format(ca.getTime());
		System.out.println(p);
	}
}
