package com.iu.api2.collections.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		//1.학생정보초기화
		//2.학생정보전체조회
		//3.학생정보검색조회(이름)
		//4.학생정보추가
		//5.학생정보삭제(이름)
		//6.프로그램 종료
		StudentDAO dao = new StudentDAO();
		dao.init();
	}

}
