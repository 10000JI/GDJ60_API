package com.iu.api3.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileMain3 {
	public static void main(String[] args) {
		File file = new File("C:\\fileTest","test.txt");
		try {
			FileReader fr = new FileReader(file);
			//문자를 String으로 읽어주자
			//버퍼에 있는 문자를 String으로 읽자
			//"보조스트림" 사용
			BufferedReader br =new BufferedReader(fr);
			//readLine(): 한줄 읽고 리턴
			// "\n" 만날 때를 한줄로 생각
			//저장되어 있는 여러 줄의 문자열을 꺼내보자
			//null이라는건 엔터쳐도 더이상 밑으로 내려가지 않는 상태
			//(엔터도 글자다)
			while(true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
