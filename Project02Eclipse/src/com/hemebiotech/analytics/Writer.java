package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Writer {
	private String filePath;
	
	public Writer(String filePath) {
		this.filePath = filePath;
	}
	
	public void Write(Map <String, Integer> sortedMap) {
		
		try {
			FileWriter writer = new FileWriter (filePath);
			
			for (Map.Entry <String, Integer> mapentry : sortedMap.entrySet()) {
	          writer.write(mapentry.getKey() + " "+ mapentry.getValue()+"\n");
	        }
			writer.close(); 
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
