package com.iu.api3.exception;

public class CustomException extends Exception{
	//extends Exception : 예외클래스로 등록
	public CustomException() {
		//부모객체 만들고 확장하여 자식객체
		
	}
	
	public CustomException(String message) {
		super(message);
	}
	
}
