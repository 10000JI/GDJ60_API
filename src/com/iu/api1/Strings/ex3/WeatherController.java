package com.iu.api1.Strings.ex3;

import java.util.Scanner;

public class WeatherController {
	//start 
	//1.날씨정보초기화 ->init()
	//	초기화 완료 되었습니다.
	//2.전국날씨정보	-> view()
	//3.지역날씨검색 
	//	없으면 도시 정보가 없습니다. 출력
	//4.지역날씨추가
	//5.지역날씨삭제
	//6.종	 료
	private Scanner sc;
	private WeatherData weatherData;
	private WeatherView weatherView;
	private WeatherInput weatherInput;
	private WeatherDTO[] weatherDTOs; //null값 줘야 1번 초기화 진행됨
	//개발자스럽게 private 애용하자
	
	public WeatherController() {
		this.sc = new Scanner(System.in);
		this.weatherData = new WeatherData();
		this.weatherView = new WeatherView();
		this.weatherInput = new WeatherInput();
		
	}
	
	public void start() {		
		while(true) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종 료");
			int num = sc.nextInt();
			
			if(num==1) {
				weatherDTOs = weatherData.init();
				System.out.println("초기화 완료되었습니다.");
			}else if(num==2) {
				weatherView.view(weatherDTOs);
			}else if(num==3) {
				WeatherDTO weatherDTO = weatherInput.search(weatherDTOs);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					System.out.println("그런 지역은 없어요!");
				}
			}else if(num==4) {
				weatherDTOs = weatherInput.add(weatherDTOs);
			}else if(num==5) {
				weatherDTOs = weatherInput.remove(weatherDTOs);
			}else if(num==6) {
				break;
			}else {
				System.out.println("다시 숫자를 입력하세요");
			}
		}
	}
}
