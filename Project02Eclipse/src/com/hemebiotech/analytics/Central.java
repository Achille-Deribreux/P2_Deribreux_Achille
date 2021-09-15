package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author achillederibreux
 *
 */
public class Central {
	
	
	private ISymptomReader getObject;
	private Analytics sortObject;
	private IWriteOutput writeObject;
	
	
	public Central( ISymptomReader GetMethod, Analytics SortMethod, IWriteOutput WriteMethod) {
		this.getObject = GetMethod;
		this.sortObject = SortMethod;
		this.writeObject = WriteMethod;
	}
	
	public List<String> getData(){
		/**
		 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
		 */
		return getObject.GetSymptoms();
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
