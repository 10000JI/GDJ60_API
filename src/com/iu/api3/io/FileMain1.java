package com.iu.api3.io;

import java.io.File;

public class FileMain1 {
	public static void main(String[] args) {
		//1.java.io.File 클래스
		//	HDD에 파일과 폴더의 정보를 담으려고 하는 클래스
		//	\\: \의 문자를 그대로 출력
		File file = new File("C:\\");
		
		//isDirectory():폴더인지 아닌지 true/false
		//isFile():파일인지 아닌지 true/false
		//file.length(): 크기를 나타냄
		//(폴더 안에 아무런 내용이 없어서 0출력)
		//file.exists(): 해당 파일이 존재? t/f
		//file.mkdir():폴더 생성 (부모폴더가 있어야 생성가능)
		//file.mkdirs():"없는 폴더\\없는폴더"로 적어도
		//여러 폴더로 생성가능
		//file.delete(): 폴더 삭제
		//단, 폴더 안에 폴더가 있다면 삭제 불가능
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.exists());
		file.mkdir();
		if(!file.exists()) {
			file.mkdirs();
		}
		//file.list(): 폴더 이름을 String[]으로 리턴
		//File(File,String): 절대경로
		String [] files = file.list();
		for(String name:files) {
			System.out.println(name);
			File f = new File(file, name); //절대경로
			System.out.println(f.isDirectory());
		}
		
		//위 for문 작업을 한번에 해줌
		File[] fs = file.listFiles();
		
		//file.delete();
	}
}
