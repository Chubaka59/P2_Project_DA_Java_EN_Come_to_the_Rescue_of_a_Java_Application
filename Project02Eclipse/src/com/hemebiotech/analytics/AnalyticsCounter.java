package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) {

		SymptomReader symptomsReader = new ReadSymptomDataFromFileImpl("Project02Eclipse/symptoms.txt");
		List<String> symptomsList = symptomsReader.getSymptoms();

		SymptomListToMapConverter listToMap = new SymptomListToMapConverterImpl();
		Map<String, Integer> symptomsMap = listToMap.compute(symptomsList);

		SymptomWriter results = new WriteSymptomDataToFileImpl("Project02Eclipse/result.out");
		results.exportResults(symptomsMap);
	}
}
