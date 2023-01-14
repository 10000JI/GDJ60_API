package com.iu.api4.network.ex.client;

import java.util.ArrayList;

public class StudentView {
	public void view(String msg) {
		System.out.println(msg);
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(StudentDTO studentDTO:ar) {
			this.view(studentDTO);
		}
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("===========================");
		System.out.println("Name: "+studentDTO.getName());
		System.out.println("Num : "+studentDTO.getNum());
		System.out.println("Kor : "+studentDTO.getKor());
		System.out.println("Eng : "+studentDTO.getEng());
		System.out.println("Math: "+studentDTO.getMath());
		System.out.println("Total: "+studentDTO.getTotal());
		System.out.println("Avg: "+studentDTO.getAvg());
	}
}
