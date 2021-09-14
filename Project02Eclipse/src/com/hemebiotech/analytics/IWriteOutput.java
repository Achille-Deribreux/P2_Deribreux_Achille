package com.hemebiotech.analytics;

import java.util.Map;

public interface IWriteOutput {
	
	/**
	 * 
	 * @param Map with string as Key and Integer as Value
	 */
	void write(Map<String, Integer> sortedMap);
}
