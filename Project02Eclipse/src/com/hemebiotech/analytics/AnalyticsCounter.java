package com.hemebiotech.analytics;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		/**
		 *Application permettant de lire des symptômes depuis un fichier et de créer un fichier listant chaque symptome avec son nombre d'occurence.
		 */
		
		//Définir les path des fichiers d'entrée & Sortie.
		final String ENTRY_PATH = "./Project02Eclipse/symptoms.txt";
		final String RESULT_PATH = "result.out";
		
		//Lis les données depuis un fichier
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(ENTRY_PATH);
		
		//Compte les occurences
		Counter count = new Counter(read.GetSymptoms());
		
		//Crée un fichier de sortie contenant les symptomes et leurs occurence
		WriteInTextFile writeInTextFile = new WriteInTextFile(RESULT_PATH);
		writeInTextFile.write(count.CountOccurences());
	}
}