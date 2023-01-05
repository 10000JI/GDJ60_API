package com.iu.api1.Strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str == str2);
		
		boolean check = str.equals(str2);	
		System.out.println(check);
		
		char ch = str2.charAt(1);
		System.out.println("Char: "+ch);

		System.out.println(str2.codePointAt(0));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하시오: ");
		ch = sc.next().charAt(0);
		System.out.println(ch);
		
		int index = str2.indexOf("b");
		System.out.println("indexOf: "+index);
	}

}
