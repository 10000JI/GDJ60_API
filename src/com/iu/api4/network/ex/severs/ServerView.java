package com.iu.api4.network.ex.severs;

import java.util.ArrayList;

public class ServerView {
	
	public void view(String msg) {
		System.out.println(msg);
	}
	
	public StringBuffer view(ServerDTO serverDTO) {
		StringBuffer sb = new StringBuffer();
		sb.append(serverDTO.getName());
		sb.append("-");
		sb.append(serverDTO.getNum());
		sb.append("-");
		sb.append(serverDTO.getKor());
		sb.append("-");
		sb.append(serverDTO.getEng());
		sb.append("-");
		sb.append(serverDTO.getMath()+" ");
			//append 시킨 StringBuffer를 toString 문자열로 바꾸기
		return sb;
	}
	
	public StringBuffer view(ArrayList<ServerDTO> ar) {
		ServerDAO serverDAO = new ServerDAO();
		StringBuffer sb = new StringBuffer();
		ar = serverDAO.init();
		for(int i =0;i<ar.size();i++) {
			sb.append(ar.get(i).getName());
			sb.append("-");
			sb.append(ar.get(i).getNum());
			sb.append("-");
			sb.append(ar.get(i).getKor());
			sb.append("-");
			sb.append(ar.get(i).getEng());
			sb.append("-");
			sb.append(ar.get(i).getMath()+" ");
			//append 시킨 StringBuffer를 toString 문자열로 바꾸기
		}
		return sb;
	}
	
}
