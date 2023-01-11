package com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {
	public static void main(String[] args) {
		File file = new File("C:\\fileTest","test.txt");
		System.out.println(file.exists());
		
		//파일의 내용을 작성
		String name = "Suji";                            
		try {
			FileWriter fw = new FileWriter(file,true);
			//"\r\n" 뒤로 땅기고 한줄쓰고 다음줄
			fw.write(name+"\r\n");
			//flush(): 강제로 버퍼 비우기
			fw.flush();
			//FileWriter fw = new FileWriter(file);로 하면
			//두번이상 실행 시 덮어씌운다.
			//FileWriter fw = new FileWriter(file,true);로 하면
			//추가된다.
			//boolean 기본은 false이다.(덮어씌우는게 디폴트)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
