package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	//DAO와 VIEW에 대해서 의존적이다.
	//의존적이다 = 멤버변수로 필요
	
	private Scanner sc;
	private StudentDAO studentDAO; //의존적
	private StudentView studentView; //의존적
	private ArrayList<StudentDTO> ar;
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		studentDAO = new StudentDAO(); //주입
		studentView = new StudentView(); //주입
		//의존성+주입 = dependency injection
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회(이름)");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제(이름)");
			System.out.println("6.프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = studentDAO.init();
				break;
			case 2:
				studentView.view(ar);
				break;
			case 3:
				StudentDTO studentDTO = studentDAO.findByName(ar);
				if(studentDTO != null) {
					studentView.view(studentDTO);
				}else {
					studentView.view("찾는 학생이 없다");
				}
				//view에 출력하도록, 값이 없더라도 출력
				break;
			case 4:
				studentDAO.addStudent(ar);
				break;
			case 5:
				select = studentDAO.removeStudent(ar);
				if(select == 1) {
					studentView.view("삭제 성공");
				}else {
					studentView.view("삭제 실패");
				}
				//view에 값이 없더라도 출력
				break;
			default:
				check=false;
				//반복문 종료
				break;
			}
		}
	}
}
