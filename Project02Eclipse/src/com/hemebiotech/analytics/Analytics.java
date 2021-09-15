package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will sort symptom data from a List and return a map with symptoms as key and occurrences as value
 * The important part is, the parameter of the operation, which is a list with 1 symptoms/line
 * The return is an ordered map with symptoms as key and occurrences as value,
 */
public interface Analytics {
	/**
	 * @param a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 * 
	 * @return Sorted Map with string as Key and Integer as Value
	 */
	Map<String, Integer> sortedMap(List<String> symptomsList);
}
