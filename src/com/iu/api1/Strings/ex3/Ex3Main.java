package com.iu.api1.Strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");
//		WeatherData weatherData =new WeatherData();
//		WeatherDTO[] datas = weatherData.init();
//		WeatherView weatherView = new WeatherView();
//		for(int i=0;i<datas.length;i++) {
//			System.out.println(datas[i].getCity());
//			System.out.println(datas[i].getStatus());
//		}
//		weatherView.view(datas);
		
//		WeatherController wc =new WeatherController();
//		wc.start();
//		//wc라는 변수에 객체의 주소를 만들기 때문에 재사용이 가능하다
		
		new WeatherController().start();
		//한번만 사용할때
		
		System.out.println("finish");
	}
	

}
