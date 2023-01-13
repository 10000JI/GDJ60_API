package com.iu.api4.network.ex.severs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerController {
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		boolean check = true;
		
		private ServerDAO serverDAO; //의존적
		private ServerView serverView; //의존적
		private ArrayList<ServerDTO> ar;

		
		public ServerController() {
			serverDAO = new ServerDAO(); //주입
			serverView = new ServerView(); //주입
			//의존성+주입 = dependency injection
		}
		public void start() {
		try {
			ss = new ServerSocket(8282);
			sc = ss.accept();
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(check) {
				String data = br.readLine();
				String data1 = null;
				int select = 0;
				if(data.indexOf("-")!=-1) {
					data1 = data.substring(0,data.indexOf("-"));
					select = Integer.parseInt(data1);
				}else {
					select = Integer.parseInt(data);
				}
				
				switch(select) {
				case 1:
					ar = serverDAO.init();
					StringBuffer sb = serverView.view(ar);
					String str = sb.toString();
					bw.write(str+"\r\n");
					bw.flush();
					break;
				case 2:
					data = data.substring(data.indexOf("-")+1);
					ServerDTO sd = null;
					for(ServerDTO serverDTO:ar) {
						if(data.equals(serverDTO.getName())){
							sd = serverDTO;
							break;
						}
					}
					if(sd != null) {
						sb = serverView.view(sd);
						str = sb.toString();
						bw.write(str+"\r\n");
						bw.flush();
						break;
					}else {
						str = "찾는 학생이 없다";
						bw.write(str+"\r\n");
						bw.flush();
					}
					break;
				case 3:
//					ServerDTO studentDTO = serverDAO.findByName(ar);
//					if(serverDTO != null) {
//						serverView.view(studentDTO);
//					}else {
//						serverView.view("찾는 학생이 없다");
//					}
//					//view에 출력하도록, 값이 없더라도 출력
					break;
				case 4:
					//serverDAO.addStudent(ar);
					break;
				default:
					System.out.println("서버 프로그램을 종료합니다.");
					check = false;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
