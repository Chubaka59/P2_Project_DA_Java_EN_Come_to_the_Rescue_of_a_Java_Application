package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Export a symptoms map in a file.
 * This will write one symptom by line with the number of occurrence.
 */
public interface SymptomWriter {
    void exportResults(Map<String, Integer> map);
}
