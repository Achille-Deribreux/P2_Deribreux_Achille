package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");
		Counter count = new Counter(read.GetSymptoms());
		Writer write = new Writer();
		write.Write(count.MapSorter());
	}
}