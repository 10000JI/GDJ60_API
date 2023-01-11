package com.iu.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {

	public static void main(String[] args) {
		//UUID
		//중복되지 않는 문자열을 생성 
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		
		//Random함수로 중복되지 않는 문자열을 매개변수로 넣어주고 싶으면
		//시간을 넣어주자
		Calendar calendar = Calendar.getInstance();
		name = calendar.getTimeInMillis()+"abc";
		Random random = new Random(calendar.getTimeInMillis());
	}

}
