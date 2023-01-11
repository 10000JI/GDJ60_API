package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	public void ex1() throws ArithmeticException, NullPointerException, Exception {
		Random random = new Random();
		//숫자가 0이면 예외 발생
		int num = random.nextInt(2);
		
		num = 10/num; 
		
		System.out.println(num);
	}
}
