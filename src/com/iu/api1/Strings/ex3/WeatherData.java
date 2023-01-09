package com.iu.api1.Strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
		this.data="SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,Junju,32,흐림,5";
	}
	
	public WeatherDTO[] init() {
		StringTokenizer st = new StringTokenizer(data,",");
		WeatherDTO[] weatherDTOs = new WeatherDTO[st.countTokens()/4];
		int idx=0;
		while(st.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(st.nextToken());
			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
			weatherDTO.setStatus(st.nextToken());
			weatherDTO.setGion(Integer.parseInt(st.nextToken()));
			weatherDTOs[idx]=weatherDTO;
			idx++;
		}
		return weatherDTOs;
	}
	
	
	//init 
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
//	public WeatherDTO [] init() {
//		String[] datas  = this.data.split(",");
//		WeatherDTO [] weathers = new WeatherDTO [datas.length/4];
//		int idx = 0;
//		for(int i = 0; i<datas.length;i=i+4) {
//			//증감식에 i가 4씩 증가한다
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setCity(datas[i]);
//			weatherDTO.setGion(Integer.parseInt(datas[i+1]));
//			weatherDTO.setStatus(datas[i+2]);
//			weatherDTO.setMise(Integer.parseInt(datas[i+3]));
//			weathers[idx] =weatherDTO;
//			idx++;
//			}
//		return weathers;
//	}
	
}
