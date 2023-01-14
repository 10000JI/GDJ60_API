package com.iu.api4.network.ex.sever;

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

public class StudentController {
	private ServerSocket ss;
	private Socket socket;
	private StudentDAO studentDAO;
	
	public void start()  {
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		try {
			ss = new ServerSocket(8282);
			socket = ss.accept();
			studentDAO = new StudentDAO();
			
			//초기화해서 미리 준비해 놓자
			ArrayList<StudentDTO> ar = studentDAO.init();
			
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			boolean check = true;
			
			while(check) {
				String select = br.readLine();
				String [] s = select.split(":");
				
				switch(s[0]) {
				case "1":
					//1:
					select = studentDAO.makeList(ar);
					break;
				case "2":
					//2:iu
					select = studentDAO.findByName(ar,s[1]);
					break;
				case "3":
					//3:iu:숫자:국:영:수
					select = studentDAO.addStudent(ar,s[1],s[2],s[3],s[4],s[5]);
					break;
				case "4":
					select = studentDAO.removeStudent(ar, s[1]);
					break;
				default:
					check=false;
				}
				if(check) {
					bw.write(select+"\r\n");
					bw.flush();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
