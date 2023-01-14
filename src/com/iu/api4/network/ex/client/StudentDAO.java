package com.iu.api4.network.ex.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StudentDAO {
//	private StringBuffer sb;
//	private Scanner sc;
//	
//	public StudentDAO() {
//		this.sb = new StringBuffer();
//		this.sc = new Scanner(System.in);
//	}
	
	public ArrayList<StudentDTO> init(String data) {
		data=data.replace(" ", "-");
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while (st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal() / 3);
			ar.add(studentDTO);
		}
		return ar;
	}
	
	
	
}
