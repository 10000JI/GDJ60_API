package com.iu.api1.Strings;

public class StringEx1 {

	public static void main(String[] args) {
		//
		String phone = "010-1234-5678";
		boolean check = true;
		int idx=0;
		
		while(check) {
			idx = phone.indexOf('-',idx);
			if(idx != -1) {
				System.out.println("IDX: :"+idx);
				idx++;
			}else {
				check = false;
			}
		}
	}
}

