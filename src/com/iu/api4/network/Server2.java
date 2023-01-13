package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

public class Server2 {
	public static void main(String[] args) {
		//클라이언트 접속 대기
		//1. 점심 메뉴 중에서 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중에서 하나를 랜덤하게 골라서 전송
		//3. 종료
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		String[] lunch = {"짜장면","짬뽕","탕수육","볶음밥"};
		String[] dinner = {"카레","가츠동","규동","라멘"};
		boolean check = true;
		
		
		try {
			ss = new ServerSocket(8282);
			sc = ss.accept();
			
			//읽을 준비를 하는 것이기에 미리 준비해도 된다
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			//쓸 준비를 하는 것이기에 미리 준비해도 된다
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while (check) {
				// ★★★네트워크로 받은 정보는 모두 String★★★
				String data = br.readLine();
				int select = Integer.parseInt(data);

				// while문 동작할때마다 현재시간 밀리초로 반환
				Calendar calendar = Calendar.getInstance();
				Random random = new Random(calendar.getTimeInMillis());

				String menu = null;

				switch (select) {
				case 1:
					select = random.nextInt(4);
					menu = lunch[select];
					break;
				case 2:
					select = random.nextInt(4);
					menu = dinner[select];
					break;
				default:
					System.out.println("서버 프로그램을 종료합니다.");
					//check = !check;
					check = false;
				}
				if(check) {
					bw.write(menu+"\r\n");
					bw.flush();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
