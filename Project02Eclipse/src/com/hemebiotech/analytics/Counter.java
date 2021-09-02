package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Counter {
	public List<String> symptomsList;
	
	 public Counter(List<String> symptomsList) {
		 this.symptomsList = symptomsList;
	}
	 
	public Map<String, Integer> CountOccurences() {
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
