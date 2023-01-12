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
import java.util.Scanner;

public class Server1 {
	public static void main(String[] args) {
		//채팅 프로그램, q입력하면 종료
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
			//객체를 만들면 8282포트를 열어놓고
			//클라이언트가 접속할 때까지 기다림
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
		
			//클라이언트의 응답을 받아 연결 성공
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
		
			while(true) {

				// 0과 1을 처리
				is = sc.getInputStream();
				// char
				ir = new InputStreamReader(is);
				// String
				br = new BufferedReader(ir);
				// 메세지를 읽어들인다
				msg = br.readLine();
				
				if (msg.toUpperCase().equals("Q")) {
					System.out.println("종료합니다.");
					break;
				}
				
				System.out.println("Client: " + msg);

				System.out.print("클라이언트로 보낼 메세지를 입력하세요: ");
				// 스캐너.nextLine()
				// 스페이스바까지 문자를 다 가져올 수 있다
				msg = scanner.nextLine();
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(msg + "\r\n");
				bw.flush();
				
				if (msg.toUpperCase().equals("Q")) {
					System.out.println("종료합니다.");
					break;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//연결된 역순으로 close 
			//socket까지 close
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
