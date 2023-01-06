package com.iu.api1.Strings.ex3;

public class WeatherView {
	//2개의 메서드 생성
	
	//1. 모든 날씨 정보를 출력
	//2. DTO 하나의 정보를 출력
	
	//모든정보
	public void view(WeatherDTO[] datas) {
		for(int i=0;i<datas.length;i++) {
			WeatherDTO weatherDTO = datas[i];
			this.view(weatherDTO);
		}
	}
	
	//하나의정보
	public void view(WeatherDTO weatherDTO) {
		//오버라이딩
		System.out.println("지역: "+ weatherDTO.getCity());
		System.out.println("기온: "+ weatherDTO.getGion());
		System.out.println("날씨: "+ weatherDTO.getStatus());
		System.out.println("미세먼지: "+ weatherDTO.getMise() );
		System.out.println("===================");
	}
}
