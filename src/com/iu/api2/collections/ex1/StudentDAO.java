package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private StudentDTO studentDTO;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji,3,89,74,87");
		sb.append("choa,4,71,25,99");
	}
	
	public ArrayList<StudentDTO> init(){
		ArrayList<StudentDTO> ar = new ArrayList<>();
		String str = sb.toString();
		StringTokenizer st = new StringTokenizer(str,"-");
		while(st.hasMoreTokens()) {
			studentDTO = new StudentDTO();
			
			String t1 = st.nextToken();
			studentDTO.setName(t1);
			String t2 = st.nextToken();
			studentDTO.setNum(Integer.parseInt(t2));
			String t3 = st.nextToken();
			studentDTO.setMath(Integer.parseInt(t3));
			String t4 = st.nextToken();
			studentDTO.setKor(Integer.parseInt(t4));
			String t5 = st.nextToken();
			studentDTO.setEng(Integer.parseInt(t5));
			ar.add(studentDTO);
		}
		
		st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			studentDTO = new StudentDTO();
			
			String t1 = st.nextToken();
			studentDTO.setName(t1);
			String t2 = st.nextToken();
			studentDTO.setNum(Integer.parseInt(t2));
			String t3 = st.nextToken();
			studentDTO.setMath(Integer.parseInt(t3));
			String t4 = st.nextToken();
			studentDTO.setKor(Integer.parseInt(t4));
			String t5 = st.nextToken();
			studentDTO.setEng(Integer.parseInt(t5));
			ar.add(studentDTO);
		}
		for(int i=0;i<ar.size();i++) {
			System.out.println("이름"+ar.get(i).getName());
			System.out.println("번호"+ar.get(i).getName());
			System.out.println("수학점수"+ar.get(i).getName());
			System.out.println("국어점수"+ar.get(i).getName());
			System.out.println("영어점수"+ar.get(i).getName());
		}
		return ar;
	}

}
