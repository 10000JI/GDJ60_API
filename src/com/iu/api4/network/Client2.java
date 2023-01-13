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
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("127.0.0.1",8282);
			
			//읽을 준비를 하는 것이기에 미리 준비해도 된다
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			//쓸 준비를 하는 것이기에 미리 준비해도 된다
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(true) {
				System.out.println("1.점심 2.저녁 3.종료");
				int select = sc.nextInt();
				bw.write(select+"\r\n");
				bw.flush();
				
				if(select == 3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				String menu = br.readLine();
				System.out.println("오늘 메뉴는: "+menu);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
