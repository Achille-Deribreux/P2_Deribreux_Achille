package com.hemebiotech.analytics;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
	
		final String ENTRY_PATH = "./Project02Eclipse/symptoms.txt";
		final String RESULT_PATH = "result.out";
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(ENTRY_PATH);
		Counter count = new Counter(read.GetSymptoms());
		Writer write = new Writer(RESULT_PATH);
		
		write.Write(count.CountOccurences());
	}
}