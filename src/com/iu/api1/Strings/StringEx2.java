package com.iu.api1.Strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next();
		
		for(int i=0;i<names.length;i++) {
			int idx = fileName.indexOf(".");
				if(names[i].equals(fileName.substring(idx+1))) {
					System.out.println("정상입니다.");
					break;
				}else {
					System.out.println("비정상입니다.");
			}
		}
		
	}

}
