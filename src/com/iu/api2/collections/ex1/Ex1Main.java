package com.iu.api2.collections.ex1;

import java.io.IOException;
import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) throws IOException {
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		//1.학생정보초기화
		//2.학생정보전체조회
		//3.학생정보검색조회(이름)
		//4.학생정보추가
		//5.학생정보삭제(이름)
		//6.프로그램 종료
		StudentController sc = new StudentController();
		sc.start();
		
		
//		int[] nums = new int[3];
//		for(int n:nums) {
//			
//		}
		//향상된 for
		//for(요소의자료형 변수 : 자료구조이름)
//		for (StudentDTO studentDTO : ar) {
//			
//		}
	}

}
