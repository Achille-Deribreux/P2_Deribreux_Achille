package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class ReadAnalyseWrite {
	
	private ISymptomReader getObject;
	private IAnalytics sortObject;
	private IWriteOutput writeObject;
	
	
	public ReadAnalyseWrite( ISymptomReader Get, IAnalytics Sort, IWriteOutput Write) {
		this.getObject = Get;
		this.sortObject = Sort;
		this.writeObject = Write;
	}
	
	public List<String> getData(){
		/**
		 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
		 */
		return getObject.getSymptoms();
	}
	
	public Map<String, Integer> sortedMap(){
		/**
		 * @return Sorted Map with string as Key and Integer as Value
		 */
		return sortObject.sortedMap(getData());
	}
	
	public void write() {
		writeObject.write(sortedMap());
	}
}
