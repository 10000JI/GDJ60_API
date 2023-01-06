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
	public void start() {
		Scanner sc = new Scanner(System.in);
		WeatherData weatherData =new WeatherData();
		WeatherDTO[] datas = weatherData.init();
		
		WeatherView weatherView = new WeatherView();
		WeatherInput weatherInput = new WeatherInput();
		
		while(true) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종 료");
			int num = sc.nextInt();
			
			if(num==1) {
				weatherData.init();
				System.out.println("초기화 완료되었습니다.");
			}else if(num==2) {
				weatherView.view(datas);
			}else if(num==3) {
				WeatherDTO weatherDTO = weatherInput.search(datas);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}else {
					System.out.println("그런 지역은 없어요!");
				}
			}else if(num==4) {
				datas = weatherInput.add(datas);
			}else if(num==5) {
				datas = weatherInput.remove(datas);
			}else if(num==6) {
				break;
			}else {
				
			}
		}
	}
}
