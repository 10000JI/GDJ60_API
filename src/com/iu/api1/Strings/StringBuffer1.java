package com.iu.api1.Strings;

public class StringBuffer1 {
	public static void main(String[] args) {
		//StringBuffer는 String이 아니다.
		StringBuffer sb = new StringBuffer("Hello");//hello
		
		//hello+world
		sb.append("world");
		
		System.out.println(sb);
		
		//참조변수를 출력하면 toString() : 클래스명@객체주소
		//toString()을 오버라이딩 했다..
		//toString()은 Object클래스에서 상속 받아서 자동으로 써진 것
		
		//String str = sb;
		//변수에는 같은 데이터 타입만을 담을 수 있다
		//String타입의 변수에 StringBuffer타입을 넣고 싶다면
		//StringBuffer에 리턴되는 메소드 값이 String인 것을 API문서에서 찾는다.
		//여기서는 toString, substring이 String 타입
		
		String str = sb.substring(0);
		System.out.println(str);
		str = sb.toString();
		System.out.println(str);
		sb.reverse();
		System.out.println(sb);

		str =String.valueOf(123);
		System.out.println(str);
		
		str = 123+"";
		System.out.println(str);
		//primitive 타입 + String 타입 = String타입

	}

}
