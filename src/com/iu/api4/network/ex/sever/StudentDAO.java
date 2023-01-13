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
	
	
	public ArrayList<StudentDTO> init() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		File file = new File("C:\\fileTest","1673483031846.txt");
		
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
}
