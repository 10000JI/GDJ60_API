package com.iu.api1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		//입력한 파일명과 names의 파일명과 동일하면 정상입니다 출력 아니면 비정상
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next(); //ab.cd.jpg
		
		//확장자 분리 작업
		int idx = fileName.lastIndexOf("."); //뒤에서부터 매개변수 값을 검색하여 인덱스번호 추출
		String result = fileName.substring(idx+1);
		System.out.println(result);
		boolean flag = true;
		
		//확장자가 이미지인지 검증
		for(int i=0;i<names.length;i++) {
			if(result.equals(names[i])){
				System.out.println("정상파일이다.");
				//i=names.langth;
				//조건식을 멈추는 방법
				//break 또는 조건식을 false로 만듬
				i = names.length;
				//flag = false;
				flag=!flag;
				break;
			}
		}
//		//비정상파일임을 알리는 또 다른코드
//		if(names.length-1 == i) {
//			System.out.println("비정상 파일이다");
//		}
		if(flag) {
			System.out.println("비정상 파입이다");
		}
		System.out.println("Finish");
	}
}
