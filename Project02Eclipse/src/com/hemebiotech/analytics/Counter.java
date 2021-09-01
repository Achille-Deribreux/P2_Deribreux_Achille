package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Counter {
	public List<String> symptomsList;
	
	 public Counter(List<String> symptomsList) {
		this.symptomsList = symptomsList;
	}
	 
	public Map<String, Integer> CountOccurences() {
		Map <String, Integer> symptomsMap = new HashMap <String, Integer>();
		
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
	
	public Map<String, Integer> MapSorter() {
		Map <String, Integer> sortedMap = new TreeMap <String, Integer> ( CountOccurences());
		
		Set set =sortedMap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry sortedList = (Map.Entry)iterator.next();
	      }
	      return sortedMap;
	}
}
