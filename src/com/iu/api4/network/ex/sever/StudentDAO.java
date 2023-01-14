package com.iu.api4.network.ex.sever;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class StudentDAO {
	//List의 내용들을 하나의 String으로 만들어주는 메소드
	public String makeList(ArrayList<StudentDTO> ar) {
		String result = "";
		StringBuffer sb = new StringBuffer();
		for(StudentDTO studentDTO:ar) {
			sb.append(studentDTO.getName());
			sb.append("-");
			sb.append(studentDTO.getNum());
			sb.append("-");
			sb.append(studentDTO.getKor());
			sb.append("-");
			sb.append(studentDTO.getEng());
			sb.append("-");
			sb.append(studentDTO.getMath());
			sb.append("-");
		}
		result = sb.toString();
		result = result.substring(0,result.length()-1);
		
		return result;
	}
	
	public String makeList1(StudentDTO studentDTO) {
		String result= "";
		StringBuffer sb = new StringBuffer();
		sb.append(studentDTO.getName());
		sb.append("-");
		sb.append(studentDTO.getNum());
		sb.append("-");
		sb.append(studentDTO.getKor());
		sb.append("-");
		sb.append(studentDTO.getEng());
		sb.append("-");
		sb.append(studentDTO.getMath());
			//append 시킨 StringBuffer를 toString 문자열로 바꾸기
		result = sb.toString();
		return result;
	}
	
	
	public ArrayList<StudentDTO> init() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		File file = new File("C:\\fileTest","1673452687121.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		while(check) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(s,"-");
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
		}
		return ar;
	}
	
	public String findByName(ArrayList<StudentDTO> ar, String s) {
		String result = "";
		StudentDTO st = null; 
		for(StudentDTO studentDTO:ar) {
			//향상된 for문은 조건식을 활용해 반복문을 멈출 수 X
			//따라서 보조문 break만 가능
			if(s.equals(studentDTO.getName())){
				st = studentDTO;
				break;
			}
		}
		result = makeList1(st);
		return result;
	}
	
	public String addStudent(ArrayList<StudentDTO> ar,String s1, String s2, String s3, String s4,String s5) {
		String result = "";
		StudentDTO st = new StudentDTO();
		st.setName(s1);
		st.setNum(Integer.parseInt(s2));
		st.setKor(Integer.parseInt(s3));
		st.setEng(Integer.parseInt(s4));
		st.setMath(Integer.parseInt(s5));
		st.setTotal(st.getKor()+st.getEng()+st.getMath());
		st.setAvg(st.getTotal()/3);
		ar.add(st);
		result = makeList1(st);
		return result;
	}
	
	public String removeStudent(ArrayList<StudentDTO> ar,String s) {
		String result = "";
		StudentDTO st = null; 
		for(StudentDTO studentDTO:ar) {
			if(s.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				st = studentDTO;
				break;
			}
		}
		result = makeList1(st);
		return result;
	}
	
}
