package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {
	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japen,도쿄";
		String [] n = nations.split(",");
		//독립적인 데이터일때는 split이 편함 (ex> Korea,USA..)
		
		for(int i=0;i<n.length;i++) {
			NationDTO nationDTO = new NationDTO();
			nationDTO.setName(n[i]);
			nationDTO.setCity(n[++i]);
		}
		
		StringTokenizer st = new StringTokenizer(nations,",");
		while(st.hasMoreTokens()) {
			//토큰이 있을 때까지
			NationDTO nationDTO = new NationDTO();
			
			String t1 = st.nextToken();
			//다음 토큰을 주세요
			nationDTO.setName(t1);

			String t2 = st.nextToken();
			nationDTO.setCity(t2);
		}
		//여러개의 데이터를 다룰 때는 Tokenizer가 편함(ex> Korea,서울,USA,워싱턴)
	}
}
