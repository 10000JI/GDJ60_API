package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
	public void ex2() throws CustomException {
		//2자리
		int num1 = 65;
		int num2 = 48;
		int sum = num1+num2;
		if(sum>99) {
			throw new CustomException("세자리수는 몰라요");
		}
//		int sum0 = num2-num1;
//		if(sum0<0) {
//			throw new CustomException("음수는 읽을 수 없어요");
//		}
	}
	
	public void ex1() throws Exception {
		//예외처리를 호출한 곳으로 위임S
		Random random = new Random();
		//숫자가 0이면 예외 발생
		int num = random.nextInt(2);
		
		num = 10/num; 
		
		System.out.println(num);
	}
}
