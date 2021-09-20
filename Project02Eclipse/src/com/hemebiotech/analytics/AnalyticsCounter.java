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
		
		/**
		 * @param ISymptomReader implementation , Analytics implementation, IWriteOutput implementation
		 */
		ReadAnalyseWrite analyser = new ReadAnalyseWrite(new ReadSymptomDataFromFile(ENTRY_PATH),new CountAndSortOccurences(), new WriteInTextFile(RESULT_PATH) );
		
		//Call the write method who creates an output file who list symptoms and their occurrence
		analyser.write();
	}
}