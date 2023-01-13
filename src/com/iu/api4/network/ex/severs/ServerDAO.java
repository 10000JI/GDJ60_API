package com.iu.api4.network.ex.severs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerDAO {
	
	public ArrayList<ServerDTO> init() {
		File file = new File("C:\\fileTest");
		String [] names = file.list();
		long max = 0;
		for(String name:names) {
			name = name.substring(0,name.lastIndexOf("."));
			long date = Long.parseLong(name);
			if(date>max) {
				max = date;
			}
		}
		file = new File(file, max+".txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<ServerDTO> ar = new ArrayList<>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			while((data=br.readLine())!=null){
				data = data.replace(" ", "-");
				data = data.replace(",", "");
				StringTokenizer st = new StringTokenizer(data,"-");
				ServerDTO serverDTO = new ServerDTO();
				serverDTO.setName(st.nextToken());
				serverDTO.setNum(Integer.parseInt(st.nextToken()));
				serverDTO.setKor(Integer.parseInt(st.nextToken()));
				serverDTO.setEng(Integer.parseInt(st.nextToken()));
				serverDTO.setMath(Integer.parseInt(st.nextToken()));
				ar.add(serverDTO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {
			}
		}
		return ar;
	}
	
}
