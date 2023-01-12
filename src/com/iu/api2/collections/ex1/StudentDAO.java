package com.iu.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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
		//백업시킨 내용 가져오기
		//1. 파일정보 File
		File file = new File("C:\\fileTest");
		
		//!폴더명이 시간(밀리초)으로 설정되어 있을때, 최근에 저장된 파일 리턴!
		//file.list(): 폴더 이름을 String[]으로 리턴
		//폴더 안에 있는 파일들 리턴
		String [] names = file.list();
		long max = 0;
		for(String name:names) {
			name = name.substring(0,name.lastIndexOf("."));
			long date = Long.parseLong(name);
			if(date>max) {
				max = date;
			}
		}
		
		file = new File(file, max+".txt");		
		
		//2. 파일내용을 읽기 위해서 연결 준비
		//나중에 close() 해주기 위해 (Finally문에서)
		//Exception이 발생하든 아니든 close() 해줌
		FileReader fr = null;
		
		//하나의 큰 문자열을 읽지 못하기 때문에
		//BufferedReader 써준다
		BufferedReader br = null;
		
		ArrayList<StudentDTO> ar = new ArrayList<>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			while((data=br.readLine())!=null){
				data = data.replace(" ", "-");
				data = data.replace(",", "");
				StringTokenizer st = new StringTokenizer(data,"-");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken());
				studentDTO.setNum(Integer.parseInt(st.nextToken()));
				studentDTO.setKor(Integer.parseInt(st.nextToken()));
				studentDTO.setEng(Integer.parseInt(st.nextToken()));
				studentDTO.setMath(Integer.parseInt(st.nextToken()));
				studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()
				+studentDTO.getMath());
				studentDTO.setAvg(studentDTO.getTotal()/3.0);
				ar.add(studentDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
			}
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
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()
			+studentDTO.getMath());
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
	
	//6.학생정보백업
	//현재시간을 파일명으로 해서 파일작성
	//"name-번호-국어-영어-수학" 형태로
	//학생정보초기화를 파일에서 읽어서 초기화
	public void studentBackUp(ArrayList<StudentDTO> ar) {
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();
		
		File file = new File("C:\\fileTest", time+".txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			for(StudentDTO studentDTO:ar) {
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
				sb.append("\r\n");
				//append 시킨 StringBuffer를 toString 문자열로 바꾸기
				fw.write(sb.toString());
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//위에서 아래로 close 해준다(역순)
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
//	public void backup() throws IOException {
//		Calendar calendar = Calendar.getInstance();
//		String name = String.valueOf(calendar.getTimeInMillis());
//		ArrayList<StudentDTO> ar;
//		File file = new File("C:\\fileTest",name+".txt");
//		FileWriter fw =null;
//		String str = "name-번호-국어-영어-수학";
//		try {
//			fw = new FileWriter(file,true);
//			fw.write(str+"\r\n");
//			fw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ar = init();
//		for (StudentDTO dto : ar) {
//			String st = dto.getName() + "-" + dto.getNum() + "-" + dto.getKor() + "-" + dto.getEng() + "-"
//					+ dto.getMath();
//			fw.write(st + "\r\n");
//			fw.flush();
//		}
//	}
	
}
