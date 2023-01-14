package com.iu.api4.network.ex.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClentMain {

	public static void main(String[] args) {
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		StudentDAO studentDAO = new StudentDAO();
		StudentView studentView = new StudentView();
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String data = null;
		
		try {
			
			socket = new Socket("127.0.0.1",8282);
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(check) {
				System.out.println("1: 전체학생정보출력");
				System.out.println("2: 학생정보검색출력");
				System.out.println("3: 학생정보추가");
				System.out.println("4: 학생정보삭제");
				System.out.println("5: 종료");
				
				String select = sc.next();
				bw.write(select+"\r\n");
				bw.flush();
				String [] s = select.split(":");
				
				switch(s[0]) {
				case "1":
					//1:
					System.out.println("전체학생정보출력");
					data = br.readLine();
					studentView.view(studentDAO.init(data));
					
					break;
				case "2":
					//2:iu
					//select = studentDAO.findbyname(ar,s[1]);
					System.out.println("학생정보검색출력");
					data = br.readLine();
					studentView.view(studentDAO.init(data));
					break;
				case "3":
					//3:iu:숫자:국:영:수
					//select = studentDAO.addStudent(ar,s[1]);
					System.out.println("학생정보추가");
					data = br.readLine();
					studentView.view(studentDAO.init(data));
					break;
				case "4":
					System.out.println("학생정보삭제");
					data = br.readLine();
					studentView.view(studentDAO.init(data));
					break;
				default:
					System.out.println("종료합니다.");
					check=false;	
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
