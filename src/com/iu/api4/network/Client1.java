package com.iu.api4.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) {
		//Exception 발생 가능성 있어 close() 쓰기 위해서 
		//null로 초기화
		Socket socket = null;
		
		//자바:ip+port-> socket
		//127.0.0.1 = localhost(자신의 ip)
		//포트번호 0~65535
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("127.0.0.1",8282);
			System.out.println("Server 접속 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
