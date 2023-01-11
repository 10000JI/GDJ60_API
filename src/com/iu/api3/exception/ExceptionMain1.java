package com.iu.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
//		//컴파일에러
//		int num;
//		System.out.println(num);
		
//		//예외(=Exception)
//		String num=null;
//		System.out.println(num.charAt(0));
		
		String num=null;
		Random random = new Random();
		int n = random.nextInt(2);
		if(n==0) {
			num="test";
		}
		try{
			//해당 프린트문에서 예외 발생시 catch로 간다
			System.out.println(3/n);
			//throw new ArithmeticException();
			//try~catch시에 위에처럼 예외발생한 클래스를 throw한다
			//catch로 받는다.
			System.out.println(num.charAt(0));
			//throw new NullPointerException();
			
		}catch(ArithmeticException e){
			//추적한 것을 print한다
			e.printStackTrace();
			System.out.println("예외 발생");
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			
		}catch(Throwable e) {
			
		}
		//다형성
		//NullpointerException의 부모
		//RuntimeException
		//Exception
		//Throwable
		System.out.println("종료합니다.");
	}
}
