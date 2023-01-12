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
		OutputStream os = null;
		InputStreamReader ir = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String msg = null;
		Calendar calendar = Calendar.getInstance();
		Random random = new Random(calendar.getTimeInMillis());
		Scanner scanner = new Scanner(System.in);
				
		try {
			ss = new ServerSocket(8282);
			sc = ss.accept();
			while(true) {
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				msg = br.readLine();
				if(msg.equals("1")) {
					String[] lunch = {"짜장면","짬뽕","탕수육","볶음밥"};
					int idx = random.nextInt(4);
					msg = lunch[idx];
					System.out.println("점심(중국집): "+msg);
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					bw = new BufferedWriter(ow);
					bw.write(msg + "\r\n");
					bw.flush();
				}else if(msg.equals("2")) {
					String[] lunch = {"카레","가츠동","규동","라멘"};
					int idx = random.nextInt(4);
					msg = lunch[idx];
					System.out.println("저녁(일식): "+msg);
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					bw = new BufferedWriter(ow);
					bw.write(msg + "\r\n");
					bw.flush();
					
				}else if(msg.equals("3")) {
					System.out.println("종료합니다.");
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				ow.close();
				os.close();
				
				br.close();
				ir.close();
				is.close();
				
				ss.close();
				sc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
