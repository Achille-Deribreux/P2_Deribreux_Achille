package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountAndSortOccurences implements Analytics {

	@Override
	public Map<String, Integer> sortedMap(List<String> symptomsList) {
		
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
