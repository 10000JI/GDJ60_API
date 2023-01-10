package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99");
	}
	
	//학생정보초기화
	public void init() {
		//독립적이지 않은 데이터 => split()보다는 StringTokenizer 사용
		//StirngTokenzier는 매개변수에 String 들어감
		//=> StringBuffer타입인 sb를 String으로 변환(toString)
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
		}
	}

}
