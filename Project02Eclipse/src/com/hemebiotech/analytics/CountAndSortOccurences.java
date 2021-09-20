package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * This class is count the occurrences in a raw list and returns a sorted map
 *
 */
public class CountAndSortOccurences implements IAnalytics {

	@Override
	public Map<String, Integer> sortedMap(List<String> symptomsList) {
		/**
		 * 
		 * @param a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
		 * @return Map with string symptom as Key and Integer occurrence as Value
		 */
		Map <String, Integer> symptomsMap = new TreeMap <String, Integer>();
		
		for (String symptom : symptomsList) {
			
			if(symptomsMap.containsKey(symptom)) {
				symptomsMap.replace(symptom, symptomsMap.get(symptom) + 1);	
			}
			else {
				symptomsMap.put(symptom, 1);
			}
		}
		return symptomsMap;
	}

}
