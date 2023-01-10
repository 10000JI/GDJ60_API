package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		this.sc = new Scanner(System.in);
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99");
	}
	
	//학생정보초기화
	public ArrayList<StudentDTO> init() {
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
		return ar;
	}
	
	//학생정보검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.print("검색할 이름을 입력하세요: ");
		String name = sc.next();
		StudentDTO st = null; 
		for(StudentDTO studentDTO:ar) {
			//향상된 for문은 조건식을 활용해 반복문을 멈출 수 X
			//따라서 보조문 break만 가능
			if(name.equals(studentDTO.getName())){
				st = studentDTO;
				break;
			}
		}
		return st;
	}
	
	//학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름을 입력하세요: ");
		studentDTO.setName(sc.next());
		System.out.print("번호를 입력하세요: ");
		studentDTO.setNum(sc.nextInt());
		System.out.print("국어점수를 입력하세요: ");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어점수를 입력하세요: ");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학점수를 입력하세요: ");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
	}
	
	//학생정보삭제
	public int removeStudent(ArrayList<StudentDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1이면 삭제 성공
		int result = 0;
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		//ar.remove(인덱스번호)
		//ar.remove(Object)
//ex1)
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result=1;
//				break;
//			}
//		}
		
//ex2)
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result = 1;
				break;
			}
		}
		return result;
	}
}
