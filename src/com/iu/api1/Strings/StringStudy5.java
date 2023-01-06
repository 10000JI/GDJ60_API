package com.iu.api1.Strings;


public class StringStudy5 {

	public static void main(String[] args) {
		String str = "apple# Apple, aPPle# appLe"; //전처리 작업
		
		str = str.replace(",", "#");
		//str = str.replace(" ","");
		//replace: 문자 또는 문자열을 변환
		
		String [] result = str.split("#");//파싱(parsing)
		//split:토큰을 중심으로 하나의 문자열을 여러개의 문자열로 분리
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i].trim().toUpperCase()); 
			//trim:앞뒤 공백 제고
		}
	}

}
