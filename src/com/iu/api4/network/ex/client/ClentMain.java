package com.iu.api4.network.ex.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClentMain {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",8282);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		//번호-이름-국어,,
		bw.write("1\r\n");
		bw.flush();
		
		//응답
		String str = br.readLine();
		System.out.println(str);
		
	}

}
