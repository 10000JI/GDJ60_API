package com.iu.api4.network.ex.sever;

public class ServerMain {
	public static void main(String[] args) {
		//프로그램시작 test
		try {
			StudentController sc = new StudentController();
			sc.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
