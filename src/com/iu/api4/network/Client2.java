package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1)점심 2)저녁 3)종료
		//3. 사용자가 1,2,3 중 고르기
		//1번 : 서버에서 점심 메뉴 중 하나를 보내줌, 출력
		//2번 : 서버에서 저녁 메뉴 중 하나를 보내줌, 출력
		//3번 : 서버 클라이언트 모두 종료
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		OutputStreamWriter ow = null;
		InputStreamReader ir = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		String msg =null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("127.0.0.1",8282);
			while(true) {
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				System.out.println("1.점심 2.저녁 3.종료");
				msg = sc.next();
				bw.write(msg+"\r\n");
				bw.flush();
				
				if(msg.equals("1")) {
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					msg = br.readLine();
					System.out.println("점심메뉴: " + msg);
				}else if(msg.equals("2")) {
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					msg = br.readLine();
					System.out.println("저녁메뉴: " + msg);
					
				}else if(msg.equals("3")) {
					System.out.println("종료합니다.");
					break;
				}
			}
		}catch(Exception e) {
			
		}
		
		
		
	}	
}
