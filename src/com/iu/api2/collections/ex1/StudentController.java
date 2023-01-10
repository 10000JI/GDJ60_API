package com.iu.api2.collections.ex1;

import java.util.*;

public class StudentController {
	private Scanner sc;
	private StudentDTO studentDTO;
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		this.studentDAO = new StudentDAO();
		this.studentView = new StudentView();
	}
	
	public void start() {
		while(true){
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회(이름)");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제(이름)");
			System.out.println("6.종 료");
			int num = sc.nextInt();
			
			if(num==1) {
				ar = studentDAO.init();
				System.out.println("초기화 완료되었습니다.");
			}else if(num==2) {
				studentView.view(ar);
			}else if(num==3) {
				studentDTO = studentDAO.search(ar);
				if(studentDTO != null) {
					studentView.view(studentDTO);
				}else {
					System.out.println("그런 지역은 없어요!");
				}
			}else if(num==4) {
//				weatherDTOs = weatherInput.add(weatherDTOs);
			}else if(num==5) {
//				weatherDTOs = weatherInput.remove(weatherDTOs);
			}else if(num==6) {
				break;
			}else {
				System.out.println("다시 숫자를 입력하세요");
			}
		}
	}
}
