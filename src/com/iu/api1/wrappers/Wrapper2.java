package com.iu.api1.wrappers;

public class Wrapper2 {
	public static void main(String[] args) {
		int num = 10;
		
		Integer num2 = num;
		//!! Auto-Boxing !!
		//Primitive -> Reference
		//Integer num2 = new Interger(num);
		//본래 primitive타입에 참조타입 대입이 불가능하다
		//Integer와 int는 가능 ( 반대도 가능 )
		
		
		num = num2;
		//!! Auto UnBoxing !!
		//Reference -> Primitice
		//num = num2.intValue();
		//본래 참조타입에 primitive 타입에 대입은 불가능하나
		//Integer와 int는 가능 ( 반대도 가능 )
		
		
	}
}
