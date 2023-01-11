package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {

	public static void main(String[] args) {
		//1. 키보드 연결
		//표준입력기 : 키보드, 마우스, 스캐너
		//표준출력기 : 모니터
		Scanner sc = new Scanner(System.in);
		
		//byte, 0과1을 처리
		InputStream is = System.in;
		//char
		InputStreamReader ir = new InputStreamReader(is);
		//String 보조스트림 Buffer ★★★★★★★★★★
		BufferedReader br = new BufferedReader(ir);
		try {
			System.out.println("입력");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//역순으로 닫아줌
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
