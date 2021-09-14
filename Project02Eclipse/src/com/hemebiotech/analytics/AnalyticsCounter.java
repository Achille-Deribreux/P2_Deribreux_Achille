package com.hemebiotech.analytics;

/**
 * @author Achille Deribreux
 *Application that read symptoms from an input file and creates an output file who list symptoms with their occurrence .
 */
public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		//Define input and output paths
		final String ENTRY_PATH = "./Project02Eclipse/symptoms.txt";
		final String RESULT_PATH = "result.out";
		
		//Read Data from a file
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(ENTRY_PATH);
		
		//Count occurrences
		Counter count = new Counter(read.GetSymptoms());
		
		//Create a output file, listing the symptoms and counting the occurrences
		WriteInTextFile writeInTextFile = new WriteInTextFile(RESULT_PATH);
		writeInTextFile.write(count.CountOccurences());
	}
}