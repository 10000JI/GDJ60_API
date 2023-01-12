package com.iu.api4.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		try {
			//객체를 만들면 8282포트를 열어놓고
			//클라이언트가 접속할 때까지 기다림
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			
			//클라이언트의 응답을 받아 연결 성공
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
