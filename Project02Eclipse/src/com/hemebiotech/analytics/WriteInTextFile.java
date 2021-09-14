package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * This class creates a text file to write the data received from a sorted map.
 *
 */
public class WriteInTextFile implements IWriteOutput{
private String filePath;
	
	/**
	 * 
	 * @param filepath a full or partial path to output file
	 */
	public WriteInTextFile(String filePath) {
		this.filePath = filePath;
	}
	
	
	@Override
	public void write(Map <String, Integer> sortedMap) {
		
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
