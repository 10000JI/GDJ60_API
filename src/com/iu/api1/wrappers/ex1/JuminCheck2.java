package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	//check
	//주민번호를 받아서 
	//991224-1234567
	//주민등록번호가 진짜인지 가짜인지 판별
	//맨끝자리는 체크용 번호로 뺌
	//	9	8	0	7	2	4 -	1	2	3	4	5	6
	//	x2	x3	x4	x5	x6	x7	x8	x9	x2	x3	x4	x5	
	//	18+	24+	0+	35+	12+	28+	8+	18+	6+	12+	20+	30
	//합: 122, 합을 11로 나누어서 나머지를 구함
	// 122/11 = 몫:11, 나머지:1
	//나머지 값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	//11-1=10
	//11로 뺀 결과값이 두자리면
	//11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호와 같은지 확인
	//10/10 몫:1, 나머지:0	0==7?
	
	public void check(String jumin) {
		//jumin.charAt(0) -> 불가능, 문자열만 parseInt 가능
		int num =2;
		int sum = 0;
		for(int i=0;i<jumin.length()-1;i++) {
			if(i==6) {
				continue;
			}
//			System.out.println(Integer.parseInt(jumin.substring(i,i+1))*num);
			sum = sum + Integer.parseInt(String.valueOf(jumin.charAt(i)))*num;
			num++;
			if(num==10) {
				num=2;
			}
		}
		System.out.println(sum);
		int endNumber = 11 - sum % 11;
		if(endNumber>9) {
			endNumber = endNumber % 10;
		}
		if(endNumber == Integer.parseInt(jumin.substring(13,14))) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	}	
}
