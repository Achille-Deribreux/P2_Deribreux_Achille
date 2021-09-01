package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Writer {
	/*Map <String, Integer> symptomsMap = new HashMap <String, Integer>();
	
	//public Writer(Map <String, Integer> symptomsMap) {
	//	this.symptomsMap = symptomsMap;
	//}
	*/
	
	public void Write(Map <String, Integer> sortedMap) {
		try {
			FileWriter writer = new FileWriter ("result.out");
			
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
