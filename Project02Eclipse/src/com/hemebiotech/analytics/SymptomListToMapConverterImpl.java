package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomListToMapConverterImpl implements SymptomListToMapConverter {

    public SymptomListToMapConverterImpl() {
    }

    /**
     *
     * @param symptomsList Raw List of symptoms
     */
    public Map<String, Integer> compute(List<String> symptomsList) {

        Map<String, Integer> symptomsMap = new TreeMap<>();
        for (String symptom : symptomsList) {
            if (symptomsMap.containsKey(symptom)) {
                Integer value = symptomsMap.get(symptom);
                value++;
                symptomsMap.put(symptom, value);
            } else {
                symptomsMap.put(symptom, 1);
            }
        }

        return symptomsMap;
    }
}