package com.hemebiotech.analytics;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");
		Counter count = new Counter(read.GetSymptoms());
		Writer write = new Writer();
		write.Write(count.CountOccurences());
	}
}