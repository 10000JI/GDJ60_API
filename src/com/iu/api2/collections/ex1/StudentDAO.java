package com.iu.api2.collections.ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji,3,89,74,87,");
		sb.append("choa,4,71,25,99");
		this.sc = new Scanner(System.in);
	}
	
	public ArrayList<StudentDTO> init(){
		ArrayList<StudentDTO> ar = new ArrayList<>();
		String str = sb.toString();
		str = str.replace(",", "-");
		StringTokenizer st = new StringTokenizer(str,"-");
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
		
			String t1 = st.nextToken();
			studentDTO.setName(t1);
			String t2 = st.nextToken();
			studentDTO.setNum(Integer.parseInt(t2));
			String t3 = st.nextToken();
			studentDTO.setKor(Integer.parseInt(t3));
			String t4 = st.nextToken();
			studentDTO.setEng(Integer.parseInt(t4));
			String t5 = st.nextToken();
			studentDTO.setMath(Integer.parseInt(t5));
			ar.add(studentDTO);
		}
		return ar;
	}
	
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next().toUpperCase();
		StudentDTO studentDTO = null;
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().toUpperCase().equals(name)) {
				studentDTO = ar.get(i);
				break;
			}
		}
		return studentDTO;
	}
	
	public ArrayList<StudentDTO> add(ArrayList<StudentDTO> ar){
		ArrayList<StudentDTO> ar2 = new ArrayList<>();
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름을 입력하세요: ");
		studentDTO.setName(sc.next());
		System.out.print("번호를 입력하세요: ");
		studentDTO.setNum(Integer.parseInt(sc.next()));
		System.out.print("국어점수를 입력하세요: ");
		studentDTO.setNum(Integer.parseInt(sc.next()));
		System.out.print("수학점수를 입력하세요: ");
		studentDTO.setNum(Integer.parseInt(sc.next()));
		System.out.print("영어점수를 입력하세요: ");
		studentDTO.setNum(Integer.parseInt(sc.next()));
		
		
		return ar2;
	}
	
	

}
