package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
					System.out.print("점심메뉴를 골라 입력하세요: ");
					msg = scanner.nextLine();
					os = sc.getOutputStream();
					ow = new OutputStreamWriter(os);
					bw = new BufferedWriter(ow);
					bw.write(msg + "\r\n");
					bw.flush();
				}else if(msg.equals("2")) {
					System.out.print("저녁메뉴를 골라 입력하세요: ");
					msg = scanner.nextLine();
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
			
		}
	}
}
