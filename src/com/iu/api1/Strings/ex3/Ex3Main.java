package com.iu.api1.Strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");

//		WeatherController wc =new WeatherController();
//		wc.start();
//		//wc라는 변수에 객체의 주소를 만들기 때문에 재사용이 가능하다
		
		new WeatherController().start();
		//한번만 사용할때
		
		System.out.println("finish");
	}
	

}
