package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything that will write symptom data from a source
 * The important part is, the parameter of the operation, which is an ordered map with symptoms as key and occurrences as value,
 */
public interface IWriteOutput {

	/**
	 * 
	 * @param Sorted Map with string as Key and Integer as Value
	 */
	void write(Map<String, Integer> sortedMap);
}
