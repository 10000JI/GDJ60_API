package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class StudentView {
	
	public void view(ArrayList<StudentDTO> datas) {
		for(int i=0;i<datas.size();i++) {
			StudentDTO StudentDTO = datas.get(i);
			this.view(StudentDTO);
		}
	}
	public void view(StudentDTO studentDTO) {
		System.out.println("이름: "+studentDTO.getName());
		System.out.println("번호: "+studentDTO.getNum());
		System.out.println("국어점수: "+studentDTO.getKor());
		System.out.println("영어점수: "+studentDTO.getEng());
		System.out.println("수학점수: "+studentDTO.getMath());
		System.out.println("===========================");
	}
	
	
	
}
